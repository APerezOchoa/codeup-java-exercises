package util;
import java.util.Scanner;

public class Input {

    private final Scanner scanner;

    public Input(){
        scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Please input string: ");
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

    public int getInt(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        int userInteger = scanner.nextInt();
        if(userInteger < min || userInteger > max) {
            return getInt(min, max);
        }
        return userInteger;
    }

    public double getInt(){
        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();
        return userInput;
    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        double userDouble = scanner.nextDouble();
        if(userDouble < min || userDouble > max) {
            return getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble(){
        System.out.println("Please enter a number: ");
        double userInput = scanner.nextDouble();
        return userInput;
    }

}
