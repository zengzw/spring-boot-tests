package com.phoenixt.learn.springbootgroup.service;

import com.phoenixt.learn.springbootgroup.mapper.UserMapper;
import com.phoenixt.learn.springbootgroup.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zengzw
 * @date 2018/11/9 17:00
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

   public List<User> getAll(){

       return userMapper.getAll();
   }

    public User getOne(Integer id){
       return userMapper.getOne(id);
    }

    public void insert(User user){
        userMapper.insert(user);
    }

    public void update(User user){
       userMapper.update(user);
    }

    public void delete(Integer id){
       userMapper.delete(id);
    }
}
