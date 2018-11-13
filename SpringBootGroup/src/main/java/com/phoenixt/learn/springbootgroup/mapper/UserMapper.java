package com.phoenixt.learn.springbootgroup.mapper;

import com.phoenixt.learn.springbootgroup.pojo.User;

import java.util.List;

/**
 * @author zengzw
 * @date 2018/11/9 16:55
 */
public interface UserMapper {

    List<User> getAll();

    User getOne(Integer id);

    void insert(User user);

    void update(User user);

    void delete(Integer id);

}
