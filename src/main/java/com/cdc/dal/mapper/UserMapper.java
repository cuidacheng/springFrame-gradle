package com.cdc.dal.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cdc.dal.entity.UserEntity;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    List<UserEntity> getUserList();

    UserEntity getByUsername(@Param(value = "username") String username);
}