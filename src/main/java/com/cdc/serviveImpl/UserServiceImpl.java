/**
 * Copyright (C) 2006-2018 Tuniu All rights reserved
 */
package com.cdc.serviveImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.cdc.VO.RegisterRequestVO;
import com.cdc.VO.RegisterResponseVO;
import com.cdc.dal.entity.UserEntity;
import com.cdc.dal.mapper.UserMapper;
import com.cdc.service.UserService;

/**
 * Date: 2018-06-01
 * @author cuidc
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserEntity> getUserList() {
        List<UserEntity> userList = userMapper.getUserList();
        return userList;
    }

    @Override
    public RegisterResponseVO registerNewer(RegisterRequestVO requestVO) throws Exception{
        if (null == requestVO || StringUtils.isEmpty(requestVO.getUsername()) || StringUtils.isEmpty(requestVO.getPassword()) || StringUtils.isEmpty(requestVO.getEmail())) {
            throw new Exception("用户名称、密码、邮箱不能为空");
        }
        UserEntity userEntity = userMapper.getByUsername(requestVO.getUsername());
        if (null != userEntity) {
            throw new Exception("该用户已存在");
        }
        RegisterResponseVO responseVO = new RegisterResponseVO();
        UserEntity registerUser = new UserEntity();
        Date date = new Date();
        registerUser.setUsername(requestVO.getUsername());
        registerUser.setPassword(requestVO.getPassword());
        registerUser.setEmail(requestVO.getEmail());
        registerUser.setCreateTime(date);
        registerUser.setUpdateTime(date);
        int userId = userMapper.insertSelective(registerUser);
        responseVO.setId(userId);
        return responseVO;
    }
}
