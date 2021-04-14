package com.library.management.Util;

import com.library.management.DataAccessLayer.User;

public class UserValidator {

    public boolean isValid(User user){
        if(user.getEmail().equals(null) || user.getEmail().equals("")){
            return false;
        }
        return true;
    }
}
