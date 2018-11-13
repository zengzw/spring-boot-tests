package com.phoenixt.learn.springbootgroup;

import com.phoenixt.learn.springbootgroup.config.TeaProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootgroupApplicationTests {

    @Autowired
    private TeaProperties teaProperties;


    @Test
    public void contextLoads() {
        System.out.println(teaProperties.getName());
        System.out.println(teaProperties.getCombine());
    }

}
