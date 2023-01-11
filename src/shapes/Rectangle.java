package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        System.out.println("This getArea is coming from rectangle");
        return length * width;
    }

    public double getPerimeter(){
        System.out.println("\nThis getPerimeter is coming from rectangle");
        return 2 * length + 2 * width;
    }

}
