package com.phoenixt.learn.springbootgroup.pojo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author zengzw
 * @date 2018/11/8 14:48
 */
public class User  implements Serializable {

    @ApiModelProperty("用户Id")
    private Integer id;

    @ApiModelProperty("用户名")
    private String userName;

    @ApiModelProperty("年龄")
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
