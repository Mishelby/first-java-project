package Messanger.Abstraction;

import Messanger.Functional.Telegram;
import Messanger.Interface.UserInfo;

import java.util.logging.ErrorManager;

public abstract class User implements UserInfo {
    private String userName;
    private String userLogin;
    private String userEmail;
    private String userPassword;
    private int userId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName.length() > 3) this.userName = userName;
        else System.out.println("Your name length must be more than 3!");
        this.userName = userName;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        if(userEmail.length() > 7) this.userEmail = userEmail;
        else System.out.println("Incorrect email");
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        if(userPassword.length() > 5) this.userPassword = userPassword;
        this.userPassword = userPassword;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public void userStatus() {

    }

    @Override
    public void userEmail() {

    }

    @Override
    public void userPassword() {

    }

    @Override
    public void userName() {

    }

    @Override
    public void userAge() {

    }
}
