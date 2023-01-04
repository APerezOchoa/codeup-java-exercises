import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    /////////////////// #1 a. ////////////////////////
//        int i = 5;
//        while (i <= 15){
//            System.out.print(i + " ");
//            i++;
//        }

    /////////////////// #1 b. ////////////////////////
//        /////b1/////
//        int i = 0;
//        do {
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }while (i <= 100);
//
//        /////b2/////
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        }while (i != -15);
//
//        /////b3/////
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while (i < 1000000);


    /////////////////// #1 c. ////////////////////////

        //a refactored with for loop
//        for (int i = 5; i <= 15; i++){
//            System.out.print(i + " ");
//        }
//
//        //b1 refactored with for loop
//        for (int i = 0; i <= 100; i++){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//        }
//        //b2 refactored with for loop
//        for (int i = 100; i != -15; i -= 5){
//            System.out.println(i);
//        }
//        //b3 refactored with for loop
//        for (long i = 2; i < 1000000; i*=i){
//            System.out.println(i);
//        }


    /////////////////// #2 ////////////////////////
//        for (int i = 0; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            }
//            else if (i % 3 == 0){
//                System.out.println("Fizz");
//            }
//            else if (i % 5 == 0){
//                System.out.println("Buzz");
//            }
//            else{
//                System.out.println(i);
//            }
//        }


    /////////////////// #3 ////////////////////////
//        boolean confirmation;
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int number = scanner.nextInt();
//            System.out.printf("number | squared | cubed %n------ | ------- | -----%n");
//
//            for(int i = 1; i <= number; i++){
//                int square = i*i;
//                int cubed = i*i*i;
//
//                System.out.printf("%-7d| %-8d| %-6d\n", i, square, cubed);
//            }
//
//            System.out.print("Continue? [y/n]");
//            String userInput = scanner.next();
//            confirmation = userInput.equalsIgnoreCase("y");
//        } while (confirmation);


        /////////////////// #4 ////////////////////////
        boolean confirmation;
        do {
            System.out.println("\nEnter a grade from 0-100");
            int grade = scanner.nextInt();

            if(grade >= 88){
                System.out.printf("Your letter grade would be an A.%n%n");
            } else if (grade >= 80) {
                System.out.printf("Your letter grade would be an B.%n%n");
            } else if (grade >= 67) {
                System.out.printf("Your letter grade would be an C.%n%n");
            } else if (grade >= 60) {
                System.out.printf("Your letter grade would be an D.%n%n");
            } else {
                System.out.printf("Your letter grade would be an F.%n%n");
            }

            System.out.print("Would you like to check another grade? (y/n)");
            String userInput = scanner.next();
            confirmation = userInput.equalsIgnoreCase("y");
        } while (confirmation);


    } //main close
} //class close
