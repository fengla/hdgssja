package com.meetu.controller;

import com.meetu.data.User;
import com.meetu.service.UserService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    UserService userService = new UserService();

    @GetMapping("/login")
    public User login(@RequestParam("name") String name, @RequestParam("pwd") String pwd){//todo:输入参数..几种注解参数的不同注解区别在哪里？
        //todo: 所有system.out替换为log4j
        System.out.println("enter login ...");
        System.out.println(String.format("username:%s, pwd:%s", name, pwd));
        User user = new User();
        //校验
        boolean res = userService.login(user);

        if(res){
            //mock DataBase findByID(find user profile)
            user.setAge(16);
            user.setWe_id("wexin123");
            user.setRemark("测试remark");
            user.setUserName(name);
            user.setPassword(pwd);
            //todo: generate token here
            user.setToken("123456789876dfgdgsfewafdsggrs");
            user.setUpdateTime(System.currentTimeMillis());
            return user;
        }else{
            return null;
            //登录失败怎么办？怎么返回？前端又怎么展示呢？
            //显然登录失败与登录成功前端展示的不是一样的页面。。。这个在angularJS中怎么处理？
            //难道是解析返回结果，基于返回结果进行不同的跳转？那么跳转的时候需要携带上服务端返回的数据？
            //那么技术点又来了？如何实现携带参数的跳转 ？
        }
    }

}
