package solid.liskov.good;

public abstract class FlyingBird extends Bird {

    public FlyingBird(String birdName) {
        this.birdName = birdName;
    }

    public String birdName;

    public abstract void fly();
}
