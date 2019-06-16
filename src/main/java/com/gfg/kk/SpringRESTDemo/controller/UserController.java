package com.gfg.kk.SpringRESTDemo.controller;

import com.gfg.kk.SpringRESTDemo.model.User;
import com.gfg.kk.SpringRESTDemo.userData.UserData;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    HashMap<Long, User> userMap = UserData.userMap;

    @GetMapping("/users")
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();

        for(Map.Entry<Long, User> user : userMap.entrySet())
            users.add(user.getValue());

        return users;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userMap.get(id);
    }

    @PostMapping("/user")
    public Boolean addUser(@RequestBody User user){
        if(userMap.containsKey(user.getId()))
            return false;
        else{
            userMap.put(user.getId(), user);
            return true;
        }
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        userMap.put(user.getId(), user);
        return userMap.get(user.getId());
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable("id") Long id){
        if(!userMap.containsKey(id))
            return false;
        userMap.remove(id);
        return true;

    }
}
