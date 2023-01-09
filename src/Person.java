public class Person {

    private String name;
    public String getName(){
    //TODOne: return the person's name
        return name;
    }
    //THIS ONLY MODIFIES THE NAME OF THE PERSON
    public void setName(String name){
    //TODOne: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
    //TODOne: print a message to the console using the person's name
        System.out.printf("%nHello, my name is %s%n", getName());
    }

    //THIS CREATES A NEW OBJECT OF PERSON
    public Person(String name){
        this.name = name;
    }

    public static void main(String[] args) {
//        Person thisGuy = new Person("Luffy");
//        thisGuy.sayHello();
//        thisGuy.setName("Alex");
//        System.out.println(thisGuy.getName());

        ////////////////////////////////////////////////////
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        //this compares string so it's true
//        System.out.println(person1.getName().equals(person2.getName()));
//        //this compares objects' addresses in memory so its false
//        System.out.println(person1 == person2);

        ////////////////////////////////////////////////////
        //true because you're pointing at the same address
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        ////////////////////////////////////////////////////
        Person person1 = new Person("John");
        Person person2 = person1;
        //Both say John
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        //Both say Jane because they're pointing at the same object
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}
