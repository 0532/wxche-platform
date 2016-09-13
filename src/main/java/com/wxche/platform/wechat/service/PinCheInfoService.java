package com.wxche.platform.wechat.service;

import com.wxche.platform.wechat.repository.mapper.FooUsersMapper;
import com.wxche.platform.wechat.repository.mapper.RouteInfosMapper;
import com.wxche.platform.wechat.repository.model.FooUsers;
import com.wxche.platform.wechat.repository.model.RouteInfos;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Lichao.Wang on 2016/8/24.
 */
@Service
public class PinCheInfoService {
    private static final Logger logger = LoggerFactory.getLogger(PinCheInfoService.class);
    @Autowired
    private FooUsersMapper usersMapper;
    @Autowired
    private RouteInfosMapper infosMapper;

    public List<RouteInfos> queryRouteInfos(){
        String routeDate = "2016-9-14";
        return  infosMapper.queryRouteInfos(routeDate);
    }
    public FooUsers queryUser(){
        return  usersMapper.selectByPrimaryKey(1l);
    }

}
