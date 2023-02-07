package com.ums.user_management.service;

import com.ums.user_management.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service

public class UserManagementService {
    private static List<User> users = new ArrayList<>();
    private static int id = 0;

    static {
        users.add(new User(++id,"Raj","raj1234","Dhakuria,Kolkata","6291666657"));
    }

    public void addUser(User user){
        users.add(user);
    }

    public List<User> getAllUser(){
        return users;
    }

    public User getUserById(int id){
        for(User search : users){
            if (search.getUserId() == id) return search;
        }
        return null;
    }

    public void updateUserInfo(int id, User newUser){
        User res = getUserById(id);

        res.setUserId(newUser.getUserId());
        res.setName(newUser.getName());
        res.setUserName(newUser.getUserName());
        res.setAddress(newUser.getAddress());
        res.setPhoneNumber(newUser.getPhoneNumber());
    }

    public void deleteUser(int id){
        for(int idx = 0; idx < users.size(); idx++){
            if(users.get(idx).getUserId() == id) users.remove(idx);
        }
    }
}
