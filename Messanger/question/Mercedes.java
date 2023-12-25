package Messanger.question;

public class Mercedes extends Car{
    private int carWheels = 4;

    public Mercedes(String carName) {
        super(carName);
    }

    @Override
    public void showInfo() {
        System.out.println(carWheels);
    }
}
