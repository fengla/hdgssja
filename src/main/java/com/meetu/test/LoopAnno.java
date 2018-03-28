package com.meetu.test;

import com.meetu.data.User;

import java.util.ArrayList;
import java.util.List;

public class LoopAnno {
    public static void main(String args[]){
        User user = new User("ipv", "178_", 17);
        List<User> list = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i++){
            user.setAge(19+i);
            list.add(user);
            user = null;
        }

        for(int  i=0; i<5; i++){
            System.out.println(list.get(i));
        }
    }
}
