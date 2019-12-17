package solid.oc.good;

public class OpenCloseExample {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(45.6);
        rectangle.setWeight(34.5);

        System.out.println(rectangle.getArea());
    }
}