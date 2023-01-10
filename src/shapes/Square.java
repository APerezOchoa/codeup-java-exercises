package shapes;
import java.lang.Math;

public class Square extends Rectangle {

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    public int getArea(){
        System.out.println("This getArea is coming from square");
        return (int) Math.pow(side, 2);
    }

    public int getPerimeter(){
        System.out.println("\n\nThis getPerimeter is coming from square");
        return 4 * side;
    }

}
