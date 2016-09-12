package com.wxche.platform.wechat.message.response;

/**
 * 回复语音消息的封装
 * Created by lichao.W on 2016/8/5.
 */
public class VideoResponseMessage extends BaseResponseMessage {

    private Video Video;

    public void setVideo(Video video) {
        Video = video;
    }

    public Video getVideo() {
        return Video;
    }
}
