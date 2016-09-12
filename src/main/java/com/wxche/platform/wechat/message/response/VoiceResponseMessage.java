package com.wxche.platform.wechat.message.response;

/**
 * 回复语音消息的封装
 * Created by lichao.W on 2016/8/5.
 */
public class VoiceResponseMessage extends BaseResponseMessage {

    private Voice Voice;

    public void setVoice(Voice voice) {
        Voice = voice;
    }

    public Voice getVoice() {
        return Voice;
    }
}
