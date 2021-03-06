package com.wxche.platform.wechat.core;

import com.wxche.platform.wechat.converter.MessageConvert;
import com.wxche.platform.wechat.handler.AbstractMessageHandler;
import com.wxche.platform.wechat.message.request.BaseRequestMessage;
import com.wxche.platform.wechat.message.response.BaseResponseMessage;
import com.wxche.platform.wechat.utils.MessageUtils;
import com.wxche.platform.wechat.utils.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 微信消息处理器的入口
 * Created on 2016/8/5 16:29
 */
@Controller
@RequestMapping(value = "wechat")
public class WechatController {

    private static final Logger logger = LoggerFactory.getLogger(WechatController.class);

    @Value("#{wechatProperty.token}")
    private String token;

    @Autowired
    private MessageDispatcher messageDispatcher;

    @Autowired
    private MessageConvert messageConverter;

    /**
     * 接收微信服务器的get请求
     *
     * @param signature
     * @param timestamp
     * @param nonce
     * @param echostr
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String doGet(@RequestParam(value = "signature") String signature,
                        @RequestParam(value = "timestamp") String timestamp,
                        @RequestParam(value = "nonce") String nonce,
                        @RequestParam(value = "echostr") String echostr) {

        if (SignUtil.checkSignature(token, signature, timestamp, nonce)) {
            logger.info("Get=====>"+echostr);
            return echostr;
        }
        return "";
    }

    /**
     * 接收微信服务器的post请求并响应
     * @return
     */
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, produces = "text/xml;charset=utf-8")
    public String doPost(HttpServletRequest request, HttpServletResponse response) {
        ServletInputStream inputStream = null;
        try {
            inputStream = request.getInputStream();
            Map<String, String> map = MessageUtils.parseRequest(inputStream);
            String msgType = map.get("MsgType");
            //将用户发过来的消息转换成消息对象
            BaseRequestMessage requestMessage = messageConverter.doConvert(map);
            //将不同类型的消息发送给不同的消息处理器
            AbstractMessageHandler messageHandler = messageDispatcher.doDispatch(msgType);
            //调用消息处理器处理消息
            BaseResponseMessage responseMessage = messageHandler.handleMessage(requestMessage);
            //构造给用户的响应消息
            String responseXml = MessageUtils.messageToXml(responseMessage);
            return responseXml;
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }
        return "";
    }

}
