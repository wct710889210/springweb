package com.web.converter;

import com.web.entity.User;
import org.springframework.core.convert.converter.Converter;

public class UserConverter implements Converter<String,User> {
    @Override
    public User convert(String source) {
        User user = new User();
        if(source != null){
            String [] userString = source.split("-");
            if(userString!=null&&userString.length>0){
                user.setId(Integer.parseInt(userString[0]));
                user.setName(userString[1]);
            }
        }
        return user;
    }
}
