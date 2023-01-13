package util;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        //System.out.println("Please input string: ");
        return scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String userResp = getString("Please input yes or no: ");
        if(userResp.equalsIgnoreCase("yes") || userResp.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }


//    public int getInt(int min, int max) {
//
//    }
//    public double getInt(){
//        try {
//            return Integer.valueOf(getString());
//        } catch (NumberFormatException e){
//            System.out.println("Does not work...");
//            return 0;
//        }
//    }
//    public double getDouble(double min, double max) {
//
//    }
//    public double getDouble(){
//
//    }




    public int getInt(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max);

        try {
            int userInteger = Integer.valueOf(getString());
            //int userInteger = scanner.nextInt();
            if(userInteger < min || userInteger > max) {
                return getInt(min, max);
            }
            return userInteger;
        } catch (NumberFormatException e){
            return getInt(min, max);
        }
    }

    public int getInt(){
        System.out.println("Please enter a number: ");
        try {
            int userInput = Integer.valueOf(getString());
            //int userInput = scanner.nextInt();
            return userInput;
        } catch (NumberFormatException e){
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a number between " + min + " and " + max);

        try {
            double userDouble = Double.valueOf(getString());
            //double userDouble = scanner.nextDouble();
            if(userDouble < min || userDouble > max) {
                return getDouble(min, max);
            }
            return userDouble;
        } catch (NumberFormatException e){
            return getDouble(min, max);
        }
    }

    public double getDouble(){
        System.out.println("Please enter a number: ");

        try {
            double userInput = Double.valueOf(getString());
            //double userInput = scanner.nextDouble();
            return userInput;
        } catch (NumberFormatException e){
            return getDouble();
        }
    }

}
