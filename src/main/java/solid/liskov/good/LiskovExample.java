package solid.liskov.good;

public class LiskovExample {

    public static void main(String[] args) {

        Bird penguin = new Penguin();

        penguin.eat();

        FlyingBird raven = new Duck("fdg");

        goFly(raven);
        Bird flyingBird = goEat(raven);
    }

    private static void goFly(FlyingBird bird) {
        System.out.println("whatever you send me, it works!");
        System.out.println(bird + " go fly!");
    }

    private static Bird goEat(Bird bird) {
        bird.eat();
        return bird;
    }
}
