package com.sky.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
* @Author lsh
* @Date 2021/3/1 18:07
* @Description: 欢迎来到springboot的世界
*/
@Controller
public class Hello{

    @RequestMapping("hello")
    @ResponseBody
    public Map<String,String> showHelloWord(){
        Map<String,String> map = new HashMap<>(1);
        map.put("hello","welcome to Spring Boot Word");
        return map;
    }
}
