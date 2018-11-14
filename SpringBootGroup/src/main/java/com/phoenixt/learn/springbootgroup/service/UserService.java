package com.phoenixt.learn.springbootgroup.service;

import com.phoenixt.learn.springbootgroup.mapper.UserMapper;
import com.phoenixt.learn.springbootgroup.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zengzw
 * @date 2018/11/9 17:00
 */
@Service
@CacheConfig(cacheNames = "users")
public class UserService {

    private static final String KEY_VALUE = "user";
    @Autowired
    private UserMapper userMapper;

    @Cacheable
   public List<User> getAll(){

       return userMapper.getAll();
   }

    @Cacheable(value = KEY_VALUE,key = "\"us_\"+#id")
    public User getOne(Integer id){
       return userMapper.getOne(id);
    }

    @CachePut(value = KEY_VALUE,key = "\"us_\"+#user.id")
    public void insert(User user){
        userMapper.insert(user);
    }

    @CachePut(value = KEY_VALUE,key = "\"us_\"+#user.id")
    public void update(User user){
       userMapper.update(user);
    }

    @CacheEvict(value = KEY_VALUE,key = "\"us_\"+#id")
    public void delete(Integer id){
       userMapper.delete(id);
    }
}
