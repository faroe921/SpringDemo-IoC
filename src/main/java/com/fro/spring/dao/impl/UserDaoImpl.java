package com.fro.spring.dao.impl;

import com.fro.spring.dao.IUserDao;
import com.fro.spring.entity.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: Nino
 * @Date: 2024/8/18 - 08 - 18 - 下午8:02
 * @Description: com.fro.spring.dao.impl
 * @version: 1.0
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> query() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User();
            user.setId(i);
            user.setName("faore" + i);
            users.add(user);
        }
        return users;
    }
}
