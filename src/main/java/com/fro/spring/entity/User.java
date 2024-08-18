package com.fro.spring.entity;

import java.io.Serializable;

/**
 * @Auther: Nino
 * @Date: 2024/8/18 - 08 - 18 - 下午7:57
 * @Description: com.fro.spring.entity
 * @version: 1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;

    public User() {
    }

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
