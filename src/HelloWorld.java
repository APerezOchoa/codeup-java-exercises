public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, ");
        System.out.println("World!");

        ///////////////// #1 //////////////////////
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        ///////////////// #2 //////////////////////
        String myString = "My String";
        System.out.println(myString);

        ///////////////// #3 //////////////////////
        //myString = "c";
        // does not work with single quotes cuz single quotes declares it a char type instead of string

        ///////////////// #4 //////////////////////
        //myString = 3.14159;

        ///////////////// #5 //////////////////////
        //long myNumber;
        //System.out.println(myNumber);

        ///////////////// #6 //////////////////////
        //myNumber = 3.14;
        //System.out.println(myNumber);

        ///////////////// #7 //////////////////////
        //myNumber = 123L;
        //System.out.println(myNumber);

        ///////////////// #8 //////////////////////
        //myNumber = 123;
        //System.out.println(myNumber);

        ///////////////// #9 //////////////////////
        //float myNumber = 3.14;
        double myNumber = 3.14;
        System.out.println(myNumber);

        ///////////////// #10 //////////////////////
        //int x = 5;
        //System.out.println(x++);  //post increment
        //System.out.println(x);

        //int x = 5;
        //System.out.println(++x);  //pre increment
        //System.out.println(x);

        ///////////////// #11 //////////////////////
        //String class = "classString";
        //System.out.println(class);
        //cannot do this. class is reserved word

        ///////////////// #12 //////////////////////
        //String theNumberThree = "three";
        //Object o = theNumberThree;
        //int three = (int) o;

        //int three = (int) "three";

        ///////////////// #13 //////////////////////
        //int x = 4;
        //x += 5;
        //System.out.println(x);

        //int x = 3;
        //int y = 4;
        //y *= x;
        //System.out.println(y);

        //int x = 10;
        //int y = 2;
        //x /= y;
        //y -= x;
        //System.out.println(y);

        ///////////////// #14 //////////////////////
        //byte range -128 to 127
        byte large = 127;  //recognizes it as a int since it's outside its range
        System.out.println(++large);  //goes all the way around and outputs -128

        int largestInt = Integer.MAX_VALUE;
        System.out.println(++largestInt);  //goes around, turns to negative min val
    }
}
