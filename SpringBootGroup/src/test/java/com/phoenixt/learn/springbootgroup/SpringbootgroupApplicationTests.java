package com.phoenixt.learn.springbootgroup;

import com.alibaba.fastjson.JSON;
import com.phoenixt.learn.springbootgroup.config.TeaProperties;
import com.phoenixt.learn.springbootgroup.pojo.User;
import com.phoenixt.learn.springbootgroup.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableCaching
public class SpringbootgroupApplicationTests {

    @Autowired
    private TeaProperties teaProperties;

    @Autowired
    private UserService userService;


    @Test
    public void testGetUserAll(){
        System.out.println(JSON.toJSONString(userService.getAll()));
        System.out.println(JSON.toJSONString(userService.getAll()));
    }

    @Test
    public void testGetById(){
        System.out.println(JSON.toJSONString(userService.getOne(1)));

    }


    @Test
    public void testSave(){
        User user = new User();
        user.setUserName("user-name2");
        user.setAge(20);
        userService.insert(user);
    }


    @Test
    public void testUpdate(){
        User user  =new User();
        user.setId(1);
        user.setUserName("update9-username");
        user.setAge(10);

        userService.update(user);

    }

    @Test
    public void contextLoads() {
        System.out.println(teaProperties.getName());
        System.out.println(teaProperties.getCombine());
    }

}
