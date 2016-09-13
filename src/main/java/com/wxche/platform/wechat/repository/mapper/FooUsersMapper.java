package com.wxche.platform.wechat.repository.mapper;

import com.wxche.platform.wechat.repository.model.FooUsers;

public interface FooUsersMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(FooUsers record);

    int insertSelective(FooUsers record);

    FooUsers selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(FooUsers record);

    int updateByPrimaryKey(FooUsers record);
}