package com.wxche.platform.wechat.repository.mapper;

import com.wxche.platform.wechat.repository.model.FooCars;
import org.springframework.stereotype.Repository;

@Repository
public interface FooCarsMapper {
    int deleteByPrimaryKey(Long carId);

    int insert(FooCars record);

    int insertSelective(FooCars record);

    FooCars selectByPrimaryKey(Long carId);

    int updateByPrimaryKeySelective(FooCars record);

    int updateByPrimaryKey(FooCars record);
}