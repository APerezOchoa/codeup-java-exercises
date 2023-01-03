import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        /////////////////// Exercise 1 #1 ////////////////////////
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.%n%n", pi);
//
//
//
//        /////////////////// Exercise 2 #1 ////////////////////////
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered: --> \"" + userInput + "\" <-- %n%n");
//        //If you enter anything other than an int, it'll give you an error.
//
//        /////////////////// #2 ////////////////////////
//        System.out.print("Enter three words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//        System.out.printf("You entered: --> \"" + userInput1 + ", " + userInput2 + ", " + userInput3 + "\" <--%n%n");

        /////////////////// #3 ////////////////////////
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.next();
//        System.out.printf("%nYou entered: --> \"" + userSentence + "\" <--");

        /////////////////// #4 ////////////////////////
    //*****DOES NOT WORK WITH REST OF CODE UNCOMMENTED******//
//        System.out.print("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.printf("%nYou entered: --> \"" + userSentence + "\" <--");


        /////////////////// Exercise 3 #1 ////////////////////////
        System.out.print("Enter the length of your room: ");
        String userLength = scanner.nextLine();
        int length = Integer.parseInt(userLength);
        System.out.print("Enter the width of your room: ");
        String userWidth = scanner.nextLine();
        int width = Integer.parseInt(userWidth);
        int area = length * width;
        System.out.printf("%nThe area of your room is: " + area);

        /////////////////// Exercise 3 #2 ////////////////////////
        int perimeter = (length * 2) + (width * 2);
        System.out.printf("%nThe perimeter of your room is: " + perimeter);

    }
}
