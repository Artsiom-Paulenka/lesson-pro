package lessons.car;

public class Car {
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void go() {
        System.out.println("Машина поехала");
    }

    public String toString() {
        String str = "Это машина с номером" + number;
        return str;
    }
}
