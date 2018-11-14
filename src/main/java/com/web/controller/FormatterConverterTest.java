package com.web.controller;

import com.web.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Date;

@Controller
public class FormatterConverterTest {

    @RequestMapping(path = "/user")
    @ResponseBody
    public String user(User user){
        return "user:"+user.getId()+"--名字："+user.getName();
    }

    @RequestMapping(path = "/date")
    @ResponseBody
    public Long date(Date date,Long num){
        System.out.println("num:"+num);
        return date.getTime();
    }

    @RequestMapping("/list")
    @ResponseBody
    public User list(User user){
        System.out.println(user.getName());
        for (String str:user.getStrings()){
            System.out.println(str+"\n");
        }
        System.out.println(user.getStringMap().get("key"));
        return user;
    }
}
