package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

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



    }

}
