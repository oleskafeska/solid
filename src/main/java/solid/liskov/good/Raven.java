package solid.liskov.good;

public class Raven extends FlyingBird {

    @Override
    public void fly() {

        // some logic
    }

    @Override
    public void eat() {

    }

    public Raven(String birdName) {
        super(birdName);
    }

    @Override
    public String toString() {
        return this.birdName;
    }
}
