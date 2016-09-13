package com.wxche.platform.wechat.repository.mapper;

import com.wxche.platform.wechat.repository.model.FooUsers;
import org.springframework.stereotype.Repository;

@Repository
public interface FooUsersMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(FooUsers record);

    int insertSelective(FooUsers record);

    FooUsers selectByPrimaryKey(Long userId);

    FooUsers selectByWxId(String wxId);

    int updateByPrimaryKeySelective(FooUsers record);

    int updateByPrimaryKey(FooUsers record);
}