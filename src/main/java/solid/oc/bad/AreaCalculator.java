package solid.oc.bad;

public class AreaCalculator {

    public double calculateArea(Object shape) {

        double area = 0.0;

        if (shape instanceof Rectangle) {
            area = ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWeight();
        } else if (shape instanceof Circle) {
            area = ((Circle) shape).getRadius() * ((Circle) shape).getRadius() * Math.PI;

        } else if (shape instanceof Triangle) {

            area =  ((Triangle) shape).getHeight() * ((Triangle) shape).getWeight() * 42;
        }

        return area;
    }
}
