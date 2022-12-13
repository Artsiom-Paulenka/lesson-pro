package lessons.lesson1;

public class Main {
    public static void main(String[] args) {


        Car car = new Car();
        Car secondCar = new Car();
        car.color = "Blue";
        secondCar.color = "green";


        System.out.println(car);
        System.out.println(secondCar);

        System.out.println(car.color);

        Car thirdCar = new Car();
        System.out.println(thirdCar);
        System.out.println(thirdCar.number);
        System.out.println(thirdCar.isSupercar);
        System.out.println(thirdCar.color);
    }

}