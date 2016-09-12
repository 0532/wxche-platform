package com.wxche.platform.wechat.handler;

import com.wxche.platform.wechat.message.request.BaseRequestMessage;
import com.wxche.platform.wechat.message.response.BaseResponseMessage;
import org.springframework.stereotype.Component;

/**
 * 消息处理器接口
 * Created by Lichao.W on 2016/8/6 17:36.
 */
@Component
public interface MessageHandler {

    /**
     * 真正的处理消息的方法
     *
     * @param baseRequestMessage
     * @return
     */
    BaseResponseMessage doHandleMessage(BaseRequestMessage baseRequestMessage);
}
