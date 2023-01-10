package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getArea(){
        System.out.println("This getArea is coming from rectangle");
        return length * width;
    }

    public int getPerimeter(){
        System.out.println("\nThis getPerimeter is coming from rectangle");
        return 2 * length + 2 * width;
    }

}