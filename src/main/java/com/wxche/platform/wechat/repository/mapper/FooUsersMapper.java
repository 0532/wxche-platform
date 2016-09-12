package com.wxche.platform.wechat.repository.mapper;

import com.wxche.platform.wechat.repository.model.FooUsers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FooUsersMapper {
    int deleteByPrimaryKey(Long userId);

    int insert(FooUsers record);

    int insertSelective(FooUsers record);

    //FooUsers selectByPrimaryKey(Long userId);

    List<FooUsers> selectAll();

    int updateByPrimaryKeySelective(FooUsers record);

    int updateByPrimaryKey(FooUsers record);

}