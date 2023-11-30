package abstract_class;

public class Main {
    public static void main(String[] args) {
        // new Cat -> Cat = Animal
        Animal myCat = new Cat();
        // new Animal -> Animal = Cat
        System.out.println(myCat);

        Animal myDog = new Dog();

        ((Cat) myCat).run();
    }
}
