package solid.liskov.bad;

public class Duck extends Bird {

    @Override
    public void fly() {
        System.out.println("I'm duck, and I can fly");
    }
}
