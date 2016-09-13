package com.wxche.platform.wechat.repository.model;

public class RouteInfosKey {
    private Long infoId;

    private String routeDate;

    public Long getInfoId() {
        return infoId;
    }

    public void setInfoId(Long infoId) {
        this.infoId = infoId;
    }

    public String getRouteDate() {
        return routeDate;
    }

    public void setRouteDate(String routeDate) {
        this.routeDate = routeDate == null ? null : routeDate.trim();
    }
}