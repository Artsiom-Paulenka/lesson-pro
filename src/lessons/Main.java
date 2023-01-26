package lessons;



public class Main {

        public static void main(String[] args) {

            int number = 10;
            OldCar c = null;
            //System.out.println(c);

            OldCar car = new OldCar("blue", 543, true);

            OldCar car1 = new OldCar("yellow", true);
            System.out.println(car1.number);


            car.go();
            car.go(50);


            OldCar secondCar = new OldCar("green", 12, false);

            System.out.println(car);
            System.out.println(secondCar);

            System.out.println(car.color);
            System.out.println(secondCar.color);

            System.out.println(car.number);
            System.out.println(secondCar.number);

            System.out.println("-------------------");

            OldCar thirdCar = new OldCar("yellow", 1, false);

            System.out.println(thirdCar);
            System.out.println(thirdCar.number);
            System.out.println(thirdCar.color);
            System.out.println(thirdCar.isSuperCar);

            car.go();
            secondCar.go();
            thirdCar.go();

            car.info();
            System.out.println();
            secondCar.info();
            System.out.println();
            thirdCar.info();

        }
    }
