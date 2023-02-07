package com.ums.user_management.controller;

import com.ums.user_management.model.User;
import com.ums.user_management.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v1/ums")

public class UserManagementController {
    @Autowired
    private UserManagementService userManagementService;

    @PostMapping("add-user")
    public void addUser(@RequestBody User user){
        userManagementService.addUser(user);
    }

    @GetMapping("get-all")
    public List<User> getAllUsers(){
        return userManagementService.getAllUser();
    }

    @GetMapping("get-user/id/{id}")
    public User getUserById(@PathVariable int id){
        return userManagementService.getUserById(id);
    }

    @DeleteMapping("delete-user/id/{id}")
    public void deleteUser(@PathVariable int id){
         userManagementService.deleteUser(id);
    }

    @PutMapping("update-user/id/{id}")
    public void updateUser(@PathVariable int id , @RequestBody User newUser){
        userManagementService.updateUserInfo(id, newUser);
    }

}
