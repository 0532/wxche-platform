package com.wxche.platform.wechat.message.response;

/**
 * 回复图片消息的封装
 * Created by lichao.W on 2016/8/5.
 */
public class ImageResponseMessage extends BaseResponseMessage {

    private Image Image;

    public void setImage(Image image) {
        Image = image;
    }

    public Image getImage() {
        return Image;
    }
}
