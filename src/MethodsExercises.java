import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

///////////////////////////#1/////////////////////////////////
//    public static int add(int x, int y){
//        return x + y;
//    }
//
//    public static int subtract(int x, int y){
//        return x - y;
//    }
//    public static int multiply(int x, int y){
//        return x * y;
//    }
//    public static int divide(int x, int y){
//        if (y == 0){
//            cantDoThat();
//            return 0;
//        }
//        return x / y;
//    }
//    public static void cantDoThat(){
//        System.out.println("You cannot divide by zero. It's undefined. Ignore the next zero.");
//    }
//
//    public static int modulus(int x, int y){
//        return x % y;
//    }


///////////////////////////#2/////////////////////////////////
//////////////NOT SURE IF RIGHT QUESTION STRANGE//////////////
//    public static int getInteger(int userInput) {
//        if (userInput > 0 && userInput < 11){
//            return userInput;
//        } else {
//            return 0;
//        }
//    }


///////////////////////////#3/////////////////////////////////
//    public static long factorial(int x){
//        long totalFac = 1;
//        for(int i = 1; i <= x; i++){
//            totalFac *= i;
//        }
//        return totalFac;
//    }


///////////////////////////#4/////////////////////////////////
    public static double rollDice (int x){
        return (int)(Math.random() * x) + 1;
    }





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ////////////////////#1////////////////////////
//        System.out.println(add(5, 6));
//        System.out.println(subtract(10, 4));
//        System.out.println(multiply(3, 3));
//        System.out.println(divide(22, 0));
//        System.out.println(modulus(24, 5));


        ////////////////////#2////////////////////////
//////////////NOT SURE IF RIGHT QUESTION STRANGE//////////////
//        boolean inputValid = false;
//        do {
//            System.out.print("Enter a number between 1 and 10: ");
//            int userNum = scanner.nextInt();
//            if (getInteger(userNum) == 0){
//                inputValid = true;
//                System.out.println("***Invalid entry. Please try again.***\n");
//            } else {
//                System.out.println("You entered " + getInteger(userNum));
//                inputValid = false;
//            }
//        } while (inputValid);


        ////////////////////#3////////////////////////
//////////////CANNOT GET THE USER TO INPUT TO CONTINUE /////////////////
//        boolean confirmation = false;
//        do {
//            System.out.println("\nEnter a number between 1 and 10.");
//            int facNumber = scanner.nextInt();
//            if (facNumber > 0 && facNumber < 11){
//                System.out.println(facNumber + "! = " +factorial(facNumber));
//                System.out.print("\nWould you like to continue? [y/n]");
//                String keepGoing = scanner.nextLine();
//                if(keepGoing.equalsIgnoreCase("y")){
//                    confirmation = true;
//                }
//            } else {
//                System.out.println("***Invalid entry. Please try again.***\n");
//            }
//
//        } while (confirmation);

        ////////////////////#4////////////////////////
        boolean roll = false;
        System.out.print("How many sides do your dice have? ");
        int sides = scanner.nextInt();
        System.out.print("\nWould you like to roll the dice? [y/n] ");
        String rollAgain = scanner.next();

        do {
            int die1 = (int) rollDice(sides);
            int die2 = (int) rollDice(sides);
            System.out.printf("%nYou rolled a %d and a %d.%n%n", die1, die2);
            System.out.print("Would you like to roll again? [y/n] ");
            rollAgain = scanner.nextLine();
            if (rollAgain.equalsIgnoreCase("n")){
                roll = false;
            }
        } while (roll);
        System.out.println("\n\n\nThank you for playing!");


    }



} //close class

