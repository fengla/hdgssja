package com.meetu.data;

import lombok.Data;

import java.util.Map;

@Data
public class User {

    private String userName;
    private String password;

    private String we_id;
    private String tel;
    private int age;
    private String remark;

    private String token;
    private long updateTime;
//    private Map<String,String> respect;

    public User(String we_id,String tel, int age){
        this.we_id = we_id;
        this.tel = tel;
        this.age = age;
    }

    public User(){

    }

}
