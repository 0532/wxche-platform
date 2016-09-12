package com.wxche.platform.wechat.core;

import com.wxche.platform.wechat.handler.AbstractMessageHandler;
import com.wxche.platform.wechat.annotation.MessageWorker;

/**
 * 消息分发器，根据消息的不同来将消息发送给不同的MessageWorker<br/>
 * Created on 2016/8/6 14:05.
 * @see MessageWorker 消息处理器注解<br/>
 */
public interface MessageDispatcher {

    /**
     * 将不同类型的消息发送给对应的消息处理器
     *
     * @param msgType 用户发送给公众号的消息类型
     * @return 对应的消息处理器
     */
    AbstractMessageHandler doDispatch(String msgType);

}
