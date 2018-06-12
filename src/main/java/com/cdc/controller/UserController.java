/**
 * Copyright (C) 2006-2018 Tuniu All rights reserved
 */
package com.cdc.controller;

import javax.servlet.http.HttpServletResponse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cdc.VO.RegisterRequestVO;
import com.cdc.VO.RegisterResponseVO;
import com.cdc.dal.entity.UserEntity;
import com.cdc.service.UserService;

/**
 * Date: 2018-06-01
 * @author cuidc
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public RegisterResponseVO register(@RequestBody RegisterRequestVO requestVO) throws Exception {
         return userService.registerNewer(requestVO);
    }

    @RequestMapping("/getUserList")
    public void getUserList() {
       List<UserEntity> userList = userService.getUserList();
       return;
    }

}
