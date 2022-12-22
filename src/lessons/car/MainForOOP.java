package lessons.car;

public class MainForOOP {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Cabriolet cabriolet = new Cabriolet();
        cabriolet.go();
        cabriolet.setNumber(123);
cabriolet.openRoof();
    }
}
