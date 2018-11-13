package com.phoenixt.learn.springbootgroup.pojo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author zengzw
 * @date 2018/11/8 14:48
 */
public class User {

    @ApiModelProperty("用户Id")
    private int id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("年龄")
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
