package com.phoenixt.learn.springbootgroup.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * 读取属性
 *
 * @author zengzw
 * @date 2018/11/8 11:01
 */
@Component
public class TeaProperties {

    @Value("${com.pht.name}")
    private String name;

    @Value("${com.pht.type}")
    private String type;

    @Value("${com.pht.combine}")
    private  String combine;


    public String getCombine() {
        return combine;
    }

    public void setCombine(String combine) {
        this.combine = combine;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
