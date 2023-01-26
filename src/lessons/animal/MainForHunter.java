package lessons.animal;

public class MainForHunter {

    public static void main(String[] args) {
        Hunter hunter = new Hunter();
        Bear bear = new Bear();
        hunter.killAnimal(bear);
    }
}
