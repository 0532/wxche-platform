package com.wxche.platform.wechat.message.request;

/**
 * 订阅(取消订阅)的消息封装
 * Created by lichao.W on 2016/8/5.
 */
public class SubOrUnSubEventRequestMessage extends BaseRequestMessage {

    /**
     * 事件类型，subscribe(订阅)、unsubscribe(取消订阅)
     */
    private String Event;

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }
}
