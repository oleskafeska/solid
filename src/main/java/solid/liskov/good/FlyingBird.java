package solid.liskov.good;

public abstract class FlyingBird extends Bird {

    public String birdName;


    public FlyingBird(String birdName) {
        this.birdName = birdName;
    }

    public abstract void fly();
}
