package solid.liskov.good;

public class LiskovExample {

    public static void main(String[] args) {

        Bird penguin = new Penguin();

        penguin.eat();

        FlyingBird duck = new Duck("Duck");

        goFly(duck);
        goEat(duck);

        FlyingBird raven = new Raven("Raven");

        goFly(raven);
        goEat(raven);
    }

    private static void goFly(FlyingBird bird) {
        System.out.println("whatever you send me, it works!");
        System.out.println(bird + " go fly!");
    }

    private static FlyingBird goEat(FlyingBird bird) {
        bird.eat();
        return bird;
    }
}
