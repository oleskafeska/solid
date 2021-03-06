package solid.liskov.good;

public class Duck extends FlyingBird {

    public Duck(String birdName) {
        super(birdName);
    }

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public String toString() {
        return this.birdName;
    }
}
