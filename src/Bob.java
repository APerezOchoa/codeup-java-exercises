import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //////////////// #2 /////////////////////////////
        boolean confirmation;
        do {
            System.out.println("\nTalk to Bob. You can ask him questions ?," +
                    " yell at him !,\nsay nothing to him or anything else.");
            String userInput = scanner.nextLine();

            if(userInput.endsWith("?")){
                System.out.println("\nSure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("\nWhoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("\nFine. Be that way!");
            }else {
                System.out.println("\nWhatever.");
            }

            System.out.print("\nWould you like to keep talking to Bob? (y/n) ");
            String userResp = scanner.nextLine();
            confirmation = userResp.equalsIgnoreCase("y");
        } while (confirmation);
    }
}
