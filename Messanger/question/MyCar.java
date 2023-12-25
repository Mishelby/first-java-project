package Messanger.question;

public class MyCar {
    public static void main(String[] args) {
        Car car = new Car("First car");
        Mercedes mercedes = new Mercedes("Mercedes car");

        Car car2 = new Mercedes("Mercedes car2");
        showInfo(car2, mercedes);
    }

    public static void showInfo(Car... cars){
        for(Car car:cars){
            car.showInfo();
        }
    }
}
