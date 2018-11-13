package com.phoenixt.learn.springbootgroup.controller;

import com.phoenixt.learn.springbootgroup.pojo.User;
import com.phoenixt.learn.springbootgroup.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * 控制类，加上Sweger文档
 *
 * @author zengzw
 * @date 2018/11/8 14:46
 */
@RestController
@RequestMapping("/users2")
@Api(value = "用户管理类1",description = "用户Description",tags = {"usertag","user-tag"})
public class UserController2 {


    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户列表",notes ="note")
    @RequestMapping(value ="/list",method = RequestMethod.GET)
    public List<User> getUserList(){
        return userService.getAll();
    }

    @ApiOperation(value = "获取用户信息",notes ="获取用户信息")
    @RequestMapping(value ="/{id}",method = RequestMethod.GET)
    public User getUserById(@PathVariable Integer id){
        return userService.getOne(id);
    }


    @ApiOperation(value = "创建用户",notes = "根据User对象创建用户")
    @ApiImplicitParam(name = "user",value = "用户实体",required = true,dataType = "User")
    @RequestMapping(method = RequestMethod.POST)
    public String postUser(@RequestBody User user){
        userService.insert(user);
        return "SUCCESS";
    }



    @ApiOperation(value="更新用户详细信息", notes="根据url的id来指定更新对象，并根据传过来的user信息来更新用户详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    })
    @RequestMapping(method=RequestMethod.PUT)
    public String putUser(Integer id, @RequestBody User user) {
        userService.update(user);
        return "success";
    }
}
