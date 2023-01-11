package shapes;

public class ShapeTest {

    public static void main(String[] args) {
//////////////////////Interfaces & Abstract Exercise////////////////////////

        Measurable myShape;

        Rectangle rectangle = new Rectangle(5,4);
        myShape = rectangle;
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        Square square = new Square(5);
        myShape = square;
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

//        System.out.println(myShape.getLength());
//        System.out.println(myShape.getWidth());
        // The getLength/getWidth methods are not defined for the Measurable
        // object myShape and therefore cannot be used.


///////////////////////////////////////////////////////////////////////////

//        Rectangle box1 = new Rectangle(4,5);
//        System.out.println("The perimeter is: " + box1.getPerimeter());
//        System.out.println("The area is: " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("The perimeter is: " + box2.getPerimeter());
//        System.out.println("The area is: " + box2.getArea());

    }

}
