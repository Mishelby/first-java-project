package Messanger.Functional;

import Messanger.Abstraction.User;

import java.util.Scanner;

public class CreateUser extends User {
    public CreateUser(String userName, String userLogin, String userPassword, String userEmail){
        this.setUserId(1);
        this.setUserName(userName);
        this.setUserLogin(userLogin);
        this.setUserPassword(userPassword);
        this.setUserEmail(userEmail);
    }
}
