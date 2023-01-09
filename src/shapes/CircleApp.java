package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        Circle circle = new Circle(input.getDouble());
        System.out.printf("Circle's area: %f, Circle's circumference: %f%n", circle.getArea(), circle.getCircumference());
    }
}
