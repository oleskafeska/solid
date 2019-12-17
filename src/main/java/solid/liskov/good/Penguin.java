package solid.liskov.good;

public class Penguin extends Bird {

    @Override
    public void eat() {
        System.out.println("I'm eating");
    }
}
