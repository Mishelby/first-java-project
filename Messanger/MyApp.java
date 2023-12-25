package Messanger;

import Messanger.Abstraction.App;
import Messanger.Functional.Telegram;

import java.util.List;
import java.util.Scanner;


public class MyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Send your message");

        Telegram telegram = new Telegram("Telegram");
        boolean status = telegram.receivingNotifications(telegram.sendingMessages(userSendMessage(scanner, telegram.getUserMessages())));
        telegram.countOfMessages(telegram.getCountOfMessages());
        telegram.userStatus(status);
    }
    public static String userSendMessage(Scanner scanner, List<String> userMessages){
        String userMessage = scanner.nextLine();
        userMessages.add(userMessage);
        return userMessage;
    }
}
