package main.java.liaody.spring.entity;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/26.
 */
@Repository
public class UserInfo {
    private String userName;
    private String Password;
    private String loginInfo;
    private String userId;
    private String email;

    /**
     * default constructor
     */
    public UserInfo() {

    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(String loginInfo) {
        this.loginInfo = loginInfo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "userId:" + userId + " userName:" + userName + " userPassword:******" + " userEmail:" + email;
    }

    /*    @Override
    public boolean equals(Object obj) {
    //  满足非空性
//        if (null == user) return false;
//        if(this == user) return false;
//        自反性
//        if (getClass()!= user.getClass()) return false
//         对称性
//          传递性
//          一致性
        if(this == obj)
            return false;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass() )
            return false;
        UserInfo other = (UserInfo)obj;
        if(str1 == null) {
            if(obj.str1 != null) {
                return false;
            }
        }else if (!str1.equals(other.str1) )
            return false;
    }
    if(var1 != other.var1)
            return false;
    return true;
}
*/
}
