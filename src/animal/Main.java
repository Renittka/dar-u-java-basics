package animal;

public class Main {

    public static void main(String[] args) {
        // Task 1
        Animal myAnimal = new Animal();
        System.out.println("My dog: " + myAnimal.name);
        myAnimal.age = 10;
        System.out.println(myAnimal.age);
        myAnimal.name = "Dog";
        System.out.println("My dog: " + myAnimal.name);

        int a = 10;
        int b = 5;
        a = -10;

        Animal myCat = new Animal();
        System.out.println(myCat.age);
        System.out.println("My cat: " + myCat.name);

        Person person1 = new Person();
        person1.name = "Maria";
        person1.surname = "Smith";
        person1.age = 25;
        person1.company = "DAR";
        person1.salary = 200000;

    }
}
