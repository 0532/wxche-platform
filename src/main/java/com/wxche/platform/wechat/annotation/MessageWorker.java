package com.wxche.platform.wechat.annotation;

import com.wxche.platform.wechat.enums.MessageType;
import com.wxche.platform.wechat.handler.AbstractMessageHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * created on 2016/8/13 11:29.
 * 用来标注真正处理消息的处理器，该注解只能标注在 AbstractMessageHandler的子类下
 * @see AbstractMessageHandler AbstractMessageHandler <br/>
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MessageWorker {

    //标识要处理的消息类型
    MessageType type() default MessageType.TEXT_MESSAGE;

}
