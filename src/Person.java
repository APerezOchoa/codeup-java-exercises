public class Person {

    private String name;
    public String getName(){
    //TODOne: return the person's name
        return name;
    }
    public void setName(String name){
    //TODOne: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
    //TODOne: print a message to the console using the person's name
        System.out.printf("%nHello, my name is %s%n", getName());
    }


    public static void main(String[] args) {
        Person thisGuy = new Person();
        thisGuy.setName("Alejandro");
        thisGuy.sayHello();
    }

}
