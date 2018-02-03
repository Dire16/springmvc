package com.imooc.controller;

import com.imooc.object.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping(value = "baseType.do")
    @ResponseBody
    public String baseType(@RequestParam("xage") int age){
        return"age:"+age;
    }
    @RequestMapping(value = "baseType2.do")
    @ResponseBody
    public String baseType(Integer age){
        return"age:"+age;
    }
    @RequestMapping(value = "array.do")
    @ResponseBody
    public String baseType3(String[] name){
        StringBuilder sbf=new StringBuilder();
        for(String item :name){
            sbf.append(item).append(" ");
        }
        return sbf.toString();
    }

    @RequestMapping(value = "object.do")
    @ResponseBody
    public String object(User user){
        return user.toString();
    }
}
