package Messanger.Abstraction;

import Messanger.Interface.Communication;

public abstract class App implements Communication {
    private String notification;
    private String nameOfApp;
    private String userStatus = "offline";
    private int countOfMessages;

    @Override
    public boolean sendingMessages(String message) {
        if(message.length() >= 3){
            countOfMessages++;
            return true;
        }
        return false;
    }

    public String getNameOfApp() {
        return nameOfApp;
    }

    public void setNameOfApp(String nameOfApp) {
        this.nameOfApp = nameOfApp;
    }

    @Override
    public boolean receivingNotifications(boolean sendingMessages) {
        if(sendingMessages){
            System.out.println("You have a new message!");
            return true;
        }
        return false;
    }

    @Override
    public void userStatus(boolean receivingNotifications) {
        if(receivingNotifications){
            userStatus = "online";
        } else userStatus = "offline";
        System.out.println(userStatus);
    }

    @Override
    public void countOfMessages(int countOfMessages) {
        System.out.println("Count of messages are: " + countOfMessages);
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public int getCountOfMessages() {
        return countOfMessages;
    }

    public void setCountOfMessages(int countOfMessages) {
        if(countOfMessages < 0) this.countOfMessages = 0;
        this.countOfMessages = countOfMessages;
    }

    public String getNotification() {
        return notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }
}
