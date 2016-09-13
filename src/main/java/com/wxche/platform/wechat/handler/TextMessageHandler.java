package com.wxche.platform.wechat.handler;

import com.wxche.platform.wechat.annotation.MessageWorker;
import com.wxche.platform.wechat.enums.MessageType;
import com.wxche.platform.wechat.message.request.BaseRequestMessage;
import com.wxche.platform.wechat.message.request.TextRequestMessage;
import com.wxche.platform.wechat.message.response.BaseResponseMessage;
import com.wxche.platform.wechat.repository.model.FooUsers;
import com.wxche.platform.wechat.service.PinCheInfoService;
import com.wxche.platform.wechat.utils.MessageUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 文本消息处理器事例
 * Created on 2016/8/6 10:57.
 */
@Component
@MessageWorker(type = MessageType.TEXT_MESSAGE)
public class TextMessageHandler extends AbstractMessageHandler {
    private static final Logger logger = LoggerFactory.getLogger(TextMessageHandler.class);

    @Autowired
    private PinCheInfoService pinCheInfoService;

    public BaseResponseMessage doHandleMessage(BaseRequestMessage requestMessage) {
        if (requestMessage instanceof TextRequestMessage) {
            //在这里实现你自己的业务逻辑
            String rtnMsg = "helloWorld!";
            FooUsers users = pinCheInfoService.queryUser();
            if (users != null)
                rtnMsg = users.getUserMobile();
            return MessageUtils.buildTextResponseMessage(requestMessage, rtnMsg);
        }
        return null;
    }
}
