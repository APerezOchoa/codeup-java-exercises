import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //this only points the address in memory
        System.out.println(numbers);
        //this one prints out the elements in the array
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("FirstPerson");
        people[1] = new Person("SecondPerson");
        people[2] = new Person("ThirdPerson");

        for(Person person : people){
            System.out.println(person.getName());
        }
    }
    public static addPerson{

    }
}
