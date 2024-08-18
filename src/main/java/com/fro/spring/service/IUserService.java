package com.fro.spring.service;

import com.fro.spring.entity.User;

import java.util.List;

/**
 * @Auther: Nino
 * @Date: 2024/8/18 - 08 - 18 - 下午8:27
 * @Description: com.fro.spring.service
 * @version: 1.0
 */
public interface IUserService {
    List<User> queryUser();
}
