package com.wxche.platform.wechat.message.request;

import com.wxche.platform.wechat.enums.MessageType;

/**
 * 语音消息的封装
 * Created by lichao.W on 2016/8/5.
 */
public class VoiceRequestMessage extends BaseRequestMessage {

    /**
     * 语音消息媒体id，可以调用多媒体文件下载接口拉取数据。
     */
    private String MediaId;

    /**
     * 语音格式，如amr，speex等
     */
    private String Format;

    /**
     * 语音识别结果，UTF8编码
     */
    private String Recognition;

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getFormat() {
        return Format;
    }

    public void setFormat(String format) {
        Format = format;
    }

    public String getRecognition() {
        return Recognition;
    }

    public void setRecognition(String recognition) {
        this.Recognition = recognition;
    }

    @Override
    public String getMsgType() {
        return MessageType.VOICE_MESSAGE.getTypeStr();
    }
}
