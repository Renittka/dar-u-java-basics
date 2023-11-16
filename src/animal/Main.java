package animal;

public class Main {

    static final String MY_CITY = "Almaty";

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.age = 10;
        myAnimal.name = "Dog";
        myAnimal.speed = 10;

        myAnimal.run();

        Animal myCat = new Animal();
        System.out.println(myCat.age);
        System.out.println("My cat: " + myCat.name);

        Person person1 = new Person();
        person1.name = "Maria";
        person1.surname = "Smith";
        person1.age = 25;
        person1.company = "DAR";
        person1.salary = 200000;

        Movie myMovie = new Movie();
        myMovie.rating = 9;
        System.out.println(myMovie.rating);
        System.out.println(myMovie.isGoodMovie());

        Movie.doSomethingStatic();

        System.out.println(Math.max(10, 120));

        Animal defaultAnimal = new Animal();
        System.out.println(defaultAnimal);

        Animal cat = new Animal("Cat");
        Animal dog = new Animal("Dog", 10);
        Animal cat2 = new Animal("Cat 2", 5, "Black", 10);

        System.out.println(dog);
        System.out.println(cat2);
        System.out.println(cat);
    }
}
