package jdk14;

record Person(String firstName, String lastName, int age){
    public Person(String firstName, String lastName) {
        this(firstName, lastName, 0);
    }
}
//https://openjdk.java.net/jeps/359
public class Demo1 {
    public static void main(String[] args) {
        Person person=new Person("Zura","Tikaradze", 25);
        Person person1=new Person("Zura","Tikaradze");
        System.out.println(person.age());
        System.out.println(person);

        System.out.println(person1);

    }

}


