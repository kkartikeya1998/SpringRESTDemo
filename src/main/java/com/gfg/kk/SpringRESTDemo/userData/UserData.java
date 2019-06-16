package com.gfg.kk.SpringRESTDemo.userData;

import com.gfg.kk.SpringRESTDemo.model.User;

import java.util.HashMap;

public class UserData {
    public static HashMap<Long, User> userMap = new HashMap<Long, User>();

    static {

        User user1 = new User(0L, "Rod", "Dylan");
        User user2 = new User(1L, "Steve", "Jobbs");
        User user3 = new User(2L, "Jeoff", "Bezos");
        User user4 = new User(3L, "Mark", "Evans");
        userMap.put(user1.getId(), user1);
        userMap.put(user2.getId(), user2);
        userMap.put(user3.getId(), user3);
        userMap.put(user4.getId(), user4);
    }
}
