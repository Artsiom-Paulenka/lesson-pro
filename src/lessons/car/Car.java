package lessons.car;

public abstract class Car {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public abstract void go();



//    public String toString() {
//        String str = "Это машина с номером" + number;
//        return str;
//    }
}
