package util;

public class InputTest {
    public static void main(String[] args) {
        Input inputGet = new Input();
        String userString = inputGet.getString();
        System.out.printf("User input: %s%n", userString);
        System.out.println(inputGet.yesNo());
        System.out.println(inputGet.getInt(1,100));
        System.out.println(inputGet.getInt());
        System.out.println(inputGet.getDouble(1,100));
        System.out.println(inputGet.getDouble());


    }
}
