import java.util.Arrays;

public class ArraysExercises {

    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson;
        return people;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        //below only points the address in memory
        System.out.println("\nAddress in memory: " + numbers);
        //this one prints out the elements in the array
        System.out.println("\nArray in string format: " + Arrays.toString(numbers) + "\n");
        //Create array of people then we create persons
        // and fill the array one by one using index
        Person[] people = new Person[3];
        people[0] = new Person("FirstPerson");
        people[1] = new Person("SecondPerson");
        people[2] = new Person("ThirdPerson");

        for(Person person : people){
            System.out.println(person.getName());
        }

        System.out.println("\n************************************\nAdding Sophia to people array using addPerson method...\n");
        Person sophia = new Person("Sophia");
        people = addPerson(people, sophia);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
