package solid.liskov.good;

public class Duck extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }
}
