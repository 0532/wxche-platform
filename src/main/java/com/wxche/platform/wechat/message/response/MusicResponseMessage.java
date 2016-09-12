package com.wxche.platform.wechat.message.response;

/**
 * 回复语音消息的封装
 * Created by lichao.W on 2016/8/5.
 */
public class MusicResponseMessage extends BaseResponseMessage {

    private Music Music;

    public Music getMusic() {
        return Music;
    }

    public void setMusic(Music music) {
        this.Music = music;
    }
}
