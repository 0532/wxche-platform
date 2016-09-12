package com.wxche.platform.wechat.message.request;

import com.wxche.platform.wechat.enums.MessageType;

/**
 * 文本消息的封装
 * Created by lichao.W on 2016/8/5.
 */
public class TextRequestMessage extends BaseRequestMessage {

    /**
     * 消息内容
     */
    private String Content;

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    @Override
    public String getMsgType() {
        return MessageType.TEXT_MESSAGE.getTypeStr();
    }
}
