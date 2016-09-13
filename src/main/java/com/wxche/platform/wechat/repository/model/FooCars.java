package com.wxche.platform.wechat.repository.model;

import java.util.Date;

public class FooCars {
    private Long carId;

    private String userId;

    private String userNickName;

    private String carModel;

    private String carSeat;

    private String buyYear;

    private Date createTime;

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName == null ? null : userNickName.trim();
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel == null ? null : carModel.trim();
    }

    public String getCarSeat() {
        return carSeat;
    }

    public void setCarSeat(String carSeat) {
        this.carSeat = carSeat == null ? null : carSeat.trim();
    }

    public String getBuyYear() {
        return buyYear;
    }

    public void setBuyYear(String buyYear) {
        this.buyYear = buyYear == null ? null : buyYear.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}