package com.phoenixt.learn.springbootgroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * 模板控制类
 *
 * @author zengzw
 * @date 2018/11/8 12:05
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://www.likeatea.cn");
        map.addAttribute("name", "tea ground");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";
    }
}
