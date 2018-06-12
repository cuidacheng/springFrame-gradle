/**
 * Copyright (C) 2006-2018 Tuniu All rights reserved
 */
package com.cdc.service;

import java.util.List;

import com.cdc.VO.RegisterRequestVO;
import com.cdc.VO.RegisterResponseVO;
import com.cdc.dal.entity.UserEntity;

/**
 * Date: 2018-06-01
 *
 * @author cuidc
 */
public interface UserService {
    List<UserEntity> getUserList();

    RegisterResponseVO registerNewer(RegisterRequestVO requestVO) throws Exception;
}
