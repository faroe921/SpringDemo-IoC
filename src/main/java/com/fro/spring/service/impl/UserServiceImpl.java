package com.fro.spring.service.impl;

import com.fro.spring.dao.IUserDao;
import com.fro.spring.entity.User;
import com.fro.spring.service.IUserService;

import java.util.List;

/**
 * @Auther: Nino
 * @Date: 2024/8/18 - 08 - 18 - 下午8:29
 * @Description: com.fro.spring.service.impl
 * @version: 1.0
 */
public class UserServiceImpl implements IUserService {
    //spring示例：此处dao通过设值注入来实现
    private IUserDao dao;

    @Override
    public List<User> queryUser() {
        return dao.query();
    }

    public void setDao(IUserDao dao) {
        this.dao = dao;
    }
}
