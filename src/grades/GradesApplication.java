package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        HashMap<String, Student> students = new HashMap<>();

        Student cartman = new Student("Cartman");
        cartman.addGrade(100);
        cartman.addGrade(95);
        cartman.addGrade(87);
        students.put("screwYouGuys", cartman);

        Student kyle = new Student("Kyle");
        kyle.addGrade(90);
        kyle.addGrade(91);
        kyle.addGrade(83);
        students.put("kickTheBaby", kyle);

        Student stan = new Student("Stan");
        stan.addGrade(92);
        stan.addGrade(95);
        stan.addGrade(80);
        students.put("theyKilledKenny", stan);

        Student kenny = new Student("Kenny");
        kenny.addGrade(100);
        kenny.addGrade(100);
        kenny.addGrade(90);
        students.put("muffledSounds", kenny);

        System.out.println("\n\nWelcome!\n");
        System.out.println("Here are the Github usernames of our students: \n");

        for (HashMap.Entry<String, Student> entry : students.entrySet()) {
            System.out.print(entry.getKey() + " | ");
        }
        System.out.println("");

        boolean keepGoing = true;
        do {
            System.out.println("\nWhat student would you like to see more information on?");
            String studentPick = scanner.nextLine();

            if (students.containsKey(studentPick)){
                System.out.println("\nName: " + students.get(studentPick).getName() + " - Github Username: " + studentPick);
                System.out.printf("Current Average: %.2f%n", students.get(studentPick).getGradeAverage());
            } else {
                System.out.println("\nSorry, not student found with the Github username of \"" + studentPick + "\".");
            }
            System.out.println("\nWould you like to see another student?");
            String userY = scanner.nextLine();
            if (userY.equalsIgnoreCase("n") || userY.equalsIgnoreCase("no")){
                System.out.println("\n\nGoodbye, and have a wonderful day!");
                keepGoing =  false;
            }
        } while (keepGoing);


    }

}
