package com.wxche.platform.wechat.repository.model;

public class FooCars {
    private Long carId;

    private String userId;

    private String userNickName;

    private String carModel;

    private String carSeat;

    private String buyYear;

    private String remark1;

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

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
}