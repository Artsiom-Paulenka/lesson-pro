package lessons.car;

public class Cabriolet extends Car {

    private boolean roofIsOpen;

    public void openRoof() {
        roofIsOpen = true;
    }

    public void closeRoof () {
        roofIsOpen = false;
    }
}
