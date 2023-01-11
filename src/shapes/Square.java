package shapes;
import java.lang.Math;

public class Square extends Quadrilateral {
//////////////////////Interfaces & Abstract Exercise////////////////////////

    public Square(double side) {
        super(side, side);
    }

    public double getPerimeter() {
        return 4 * length;
    }

    public double getArea() {
        return length * length;
    }

    public double setLength() {
        return length;
    }

    public double setWidth() {
        return width;
    }

/////////////////////////////////////////////////////////////////////////////

//    protected double side; //gotta make this to use w/ this.side
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
//    public double getArea(){
//        System.out.println("This getArea is coming from square");
//        return Math.pow(side, 2);
//    }
//
//    public double getPerimeter(){
//        System.out.println("\n\nThis getPerimeter is coming from square");
//        return 4 * side;
//    }

}
