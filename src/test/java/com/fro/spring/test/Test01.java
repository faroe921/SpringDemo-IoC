package com.fro.spring.test;

import com.fro.spring.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: Nino
 * @Date: 2024/8/18 - 08 - 18 - 下午8:50
 * @Description: com.fro.spring.test
 * @version: 1.0
 */
public class Test01 {
    @Test
    public void test01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        UserController bean = ac.getBean(UserController.class);
        bean.queryList();
    }
}
