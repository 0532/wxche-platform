package com.wxche.platform.wechat.converter;

import com.wxche.platform.wechat.message.request.BaseRequestMessage;

import java.util.Map;

/**
 * 消息转换器，将不同类型的消息转换成不同类型的消息对象
 * Created on 2016/8/6 15:26.
 */
public interface MessageConvert {

    /**
     * 将用户发送到公众号的消息转换为消息对象
     *
     * @param xmlMap 用户发送到公众号的消息
     * @return 消息对象
     */
    BaseRequestMessage doConvert(Map<String, String> xmlMap);

}
