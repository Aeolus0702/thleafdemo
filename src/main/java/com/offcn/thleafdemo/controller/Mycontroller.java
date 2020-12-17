package com.offcn.thleafdemo.controller;

import com.offcn.thleafdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
public class Mycontroller {
    @GetMapping("index")
    public String hello(Model model){
        model.addAttribute("msg","asdadsadasdasd");
        return "index";
    }
    @RequestMapping("index2")
    public String index(Model model){
        User user = new User(1001,"jack",18,"长沙市");
        model.addAttribute(user);
        Map<String, Object> map = new HashMap<>();
        map.put("src1","img1.jpg");
        map.put("src2","img2.jpg");
        model.addAttribute("map",map);
        model.addAttribute("msg","1234");
        return "index2";
    }
    @RequestMapping("index3")
    public String index2(Model model){
        List<User> list = new ArrayList<>();
        User user = new User(1001,"jack",18,"长沙市");
        User user2 = new User(1002,"lucy",18,"上海");
        User user3 = new User(1003,"blues",18,"北京");
        User user4 = new User(1004,"jerry",18,"深圳");
        list.add(user);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        model.addAttribute("userList",list);
        return "index3";
    }
    @RequestMapping("index4")
    public String index4(Model model){
        model.addAttribute("userName","Aelous");
        model.addAttribute("href","www.baidu.com");
        return "index4";
    }
    @RequestMapping("index5")
    public String index5(Model model){
        model.addAttribute("result","yes");
        model.addAttribute("menu","admin");
        model.addAttribute("person","manager");
        return "index5";
    }
    @RequestMapping("index6")
    public String index6(Model model){
        return "index6";
    }
    @RequestMapping("index7")
    public String index7(Model model){
        //日期
        Date date = new Date();
        //字符串
        String str="wdnmd------------------------------";
        String str2="wdnmd------------------------------=====================================================";
        //数字
        double price=3.14159267;
        model.addAttribute("date",date);
        model.addAttribute("String1",str);
        model.addAttribute("String2",str2);
        model.addAttribute("number",price);
        return "index7";
    }
}
