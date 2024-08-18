package com.fro.spring.controller;

import com.fro.spring.entity.User;
import com.fro.spring.service.IUserService;

import java.util.List;

/**
 * @Auther: Nino
 * @Date: 2024/8/18 - 08 - 18 - 下午8:40
 * @Description: com.fro.spring.controller
 * @version: 1.0
 */
public class UserController {
    //spring示例：此处userService需要通过构造注入来实现
    private IUserService userService;
    public void queryList(){
        List<User> users = userService.queryUser();
        for (User user : users) {
            System.out.println(user);
        }
    }

    public UserController(IUserService userService) {
        this.userService = userService;
    }
}
