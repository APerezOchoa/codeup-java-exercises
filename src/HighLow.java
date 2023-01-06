import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static int randomNumber (){
        return (int)(Math.random() * 100) + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = randomNumber();
        boolean correct = false;
        int guessCount = 1;

        do {
            System.out.println("Pick a number between 1-100 to see if you guessed correct. But you only get ten guesses. Good Luck!");
            int userGuess = scanner.nextInt();
            if(userGuess < numberToGuess){
                guessCount++;
                System.out.println("HIGHER");
            } else if (userGuess > numberToGuess) {
                guessCount++;
                System.out.println("LOWER");
            }else {
                correct = true;
                System.out.println("GOOD GUESS! You got it in " + guessCount + " guesses.");
            }
        }while (!correct && guessCount < 11);

        if (guessCount > 10){
            System.out.println("\n***Sorry, you ran out of guesses. Better luck next time.***");
        }

    }//main close

}//class close
