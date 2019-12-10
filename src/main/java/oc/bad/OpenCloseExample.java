package oc.bad;

public class OpenCloseExample {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(34.5);
        rectangle.setWeight(45.6);

        System.out.println(areaCalculator.calculateArea(rectangle));
     }
}
