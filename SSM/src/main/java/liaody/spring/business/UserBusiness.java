package main.java.liaody.spring.business;

import main.java.liaody.spring.entity.UserInfo;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/2/26.
 */
@Component
public class UserBusiness {
    private UserInfo userInfo;

    /**
     * default constructor
     */
    public UserBusiness() {
        userInfo = new UserInfo();
    }

    public UserInfo getUserById(String userId) {

        return userInfo;
    }
}
