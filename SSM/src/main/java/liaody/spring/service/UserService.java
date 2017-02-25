package main.java.liaody.spring.service;

import main.java.liaody.spring.entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2017/2/26.
 */
public interface UserService {
    public UserInfo getUserById(String userId);
    public List<UserInfo> getUserByName(String userName);
}
