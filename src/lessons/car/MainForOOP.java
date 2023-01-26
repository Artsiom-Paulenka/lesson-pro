package lessons.car;

public class MainForOOP {
    public static void main(String[] args) {

//        Cabriolet cabriolet = new Cabriolet();
//        cabriolet.go();
//        cabriolet.setNumber(123);
//        cabriolet.openRoof();

        Jeep jeep = new Jeep();
        Cabriolet cabriolet = new Cabriolet();
        CarWashingService carWashingService = new CarWashingService();

        carWashingService.washCar(cabriolet);

        carWashingService.washCar(jeep);











    }
}
