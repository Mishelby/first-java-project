package Messanger.Interface;

public interface Communication {
    boolean sendingMessages(String message);
    boolean receivingNotifications(boolean sendingMessages);
    void userStatus(boolean receivingNotifications);
    void countOfMessages(int amount);
}
