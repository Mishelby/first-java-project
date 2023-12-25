package Messanger;

import Messanger.Abstraction.App;
import Messanger.Functional.CreateUser;
import Messanger.Functional.Telegram;

import java.util.List;
import java.util.Scanner;


public class MyApp {
    public static void main(String[] args) {
        // create app
        Scanner scanner = new Scanner(System.in);
        System.out.println("Send your message");

        Telegram telegram = new Telegram("Telegram");
        boolean status = telegram.receivingNotifications(telegram.sendingMessages(userSendMessage(scanner, telegram.getUserMessages())));
        telegram.countOfMessages(telegram.getCountOfMessages());
        telegram.userStatus(status);

        // create user
        Scanner userLogin = new Scanner(System.in);
        Scanner userPass = new Scanner(System.in);
        Scanner userEmail = new Scanner(System.in);
        CreateUser firstUser = new CreateUser("User1", createUserLogin(userLogin), createUserPass(userPass), createUserEmail(userEmail));
        firstUser.userInfo();
    }
    public static String userSendMessage(Scanner scanner, List<String> userMessages){
        String userMessage = scanner.nextLine();
        userMessages.add(userMessage);
        return userMessage;
    }

    public static String createUserLogin(Scanner scanner){
        System.out.println("Enter your login");
        return scanner.nextLine();
    }
    public static String createUserPass(Scanner scanner){
        System.out.println("Enter your password");
        return scanner.nextLine();
    }
    public static String createUserEmail(Scanner scanner){
        System.out.println("Enter your email");
        return scanner.nextLine();

    }
}
