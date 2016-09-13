package com.wxche.platform.wechat.repository.model;

import java.util.Date;

public class RouteInfos extends RouteInfosKey {
    private Long userId;

    private Long carId;

    private String routeTime;

    private String routeInfo;

    private Integer routeFrom;

    private Integer routeTo;

    private Date creatrTime;

    private String remark;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getRouteTime() {
        return routeTime;
    }

    public void setRouteTime(String routeTime) {
        this.routeTime = routeTime == null ? null : routeTime.trim();
    }

    public String getRouteInfo() {
        return routeInfo;
    }

    public void setRouteInfo(String routeInfo) {
        this.routeInfo = routeInfo == null ? null : routeInfo.trim();
    }

    public Integer getRouteFrom() {
        return routeFrom;
    }

    public void setRouteFrom(Integer routeFrom) {
        this.routeFrom = routeFrom;
    }

    public Integer getRouteTo() {
        return routeTo;
    }

    public void setRouteTo(Integer routeTo) {
        this.routeTo = routeTo;
    }

    public Date getCreatrTime() {
        return creatrTime;
    }

    public void setCreatrTime(Date creatrTime) {
        this.creatrTime = creatrTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}