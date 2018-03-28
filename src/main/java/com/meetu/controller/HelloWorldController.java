package com.meetu.controller;

import com.meetu.data.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloWorldController {

//    @GetMapping("/userDetail")
//    public String init(ModelMap modelMap){
//        System.out.println("enter success");
//
//
//        User user = new User("ipv009", "17888816802", 25);
//
//        System.out.println(user);
//
//        return user.toString();
//    }

    @GetMapping("/userDetail")
    public User init(ModelMap modelMap){
        System.out.println("enter success");


        User user = new User("ipv009", "17888816802", 25);

        System.out.println(user);

        return user;
    }

}
