package com.meetu.service;

import com.meetu.data.User;

public class UserService {

//    public boolean login(String userName, String password){
      public boolean login(User user){
        if("ipv009".equals(user.getUserName())&&"111111".equals(user.getPassword())){
            return true;
        }else{
            return true;
        }
    }
}
