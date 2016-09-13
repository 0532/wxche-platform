package com.wxche.platform.wechat.repository.mapper;

import com.wxche.platform.wechat.repository.model.RouteInfos;
import com.wxche.platform.wechat.repository.model.RouteInfosKey;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteInfosMapper {
    int deleteByPrimaryKey(RouteInfosKey key);

    int insert(RouteInfos record);

    int insertSelective(RouteInfos record);

    RouteInfos selectByPrimaryKey(RouteInfosKey key);

    int updateByPrimaryKeySelective(RouteInfos record);

    int updateByPrimaryKey(RouteInfos record);
}