package Messanger.Functional;

import Messanger.Abstraction.App;

import java.util.ArrayList;
import java.util.List;

public class Telegram extends App {
    private List<String> userMessages = new ArrayList<>();
    public Telegram(String nameOfApp) {
        this.setNameOfApp(nameOfApp);
        this.setCountOfMessages(0);
    }

    public List<String> getUserMessages() {
        return userMessages;
    }

}
