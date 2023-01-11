package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

//////////////////////Interfaces & Abstract Exercise////////////////////////

    public Rectangle(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }
    //If you comment out getPerimeter, it'll give you the following error:
    // "Class 'Rectangle' must either be declared abstract
    // or implement abstract method 'getPerimeter()' in 'Measurable' "
    // Which in our case, it's because of the second explanation because it is an
    // abstract method, and therefore it must be implemented in all the subclasses

    public double getArea() {
        return length * width;
    }

    public double setLength() {
        return length;
    }

    public double setWidth() {
        return width;
    }

////////////////////////////////////////////////////////////////////////////

//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){
//        System.out.println("This getArea is coming from rectangle");
//        return length * width;
//    }
//
//    public double getPerimeter(){
//        System.out.println("\nThis getPerimeter is coming from rectangle");
//        return 2 * length + 2 * width;
//    }

}
