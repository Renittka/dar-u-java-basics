package animal;

import animal.example.Animal;
import animal.example.Cat;
import animal.example.Dog;

import java.util.Scanner;

public class Main {

    static final String MY_CITY = "Almaty";

    public static void main(String[] args) {

        homework.Animal mySecondAnimal = new homework.Animal();

        Animal myAnimal = new Animal("Rex", 10, "Dog", 5);

        myAnimal.setSpeed(0);
        myAnimal.run();

        System.out.println(myAnimal);

        Animal myCat = new Animal();
        System.out.println(myCat.getAge());
        System.out.println("My cat: " + myCat.getName());

        Person person1 = new Person();
        person1.setName("Maria");
        person1.setSurname("Smith");
        person1.setAge(25);
        person1.setCompany("DAR");
        person1.setAge(200000);

        Movie myMovie = new Movie();
        myMovie.rating = 9;
        System.out.println(myMovie.rating);
        System.out.println(myMovie.isGoodMovie());

        Movie.doSomethingStatic();

        System.out.println(Math.max(10, 120));

        Animal defaultAnimal = new Animal();
        System.out.println(defaultAnimal);

        Animal cat = new Animal("Cat");
        //cat.name = "Cat";

        Animal dog = new Animal("Dog", 10);
        Animal cat2 = new Animal("Cat 2", 5, "Black", 10);

        // Custom method usage
        cat.printInfo();
        cat2.printInfo();
        dog.printInfo();

        // toString() usage
        System.out.println(dog);
        System.out.println(cat2);
        System.out.println(cat);

        int number = 1254212;
        int digit = 2;
        int count = countSpecificDigit(number, digit);
        System.out.println("Количество цифр " + count);

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scan.next();
        System.out.println("Введите возраст");
        int age = scan.nextInt();
        System.out.println("Введите тип");
        String type = scan.next();
        System.out.println("Введите скорость");
        int speed = scan.nextInt();

        Animal newAnimal = new Animal(name, age, type, speed);
        System.out.println(newAnimal);

        Cat cat3 = new Cat("Catty", "No type", 3, "Black cat");
        System.out.println(cat3);

        cat3.run();

        Cat cat4 = new Cat("Catty", "No type", 3, 5, "Black cat");
        System.out.println(cat4);

        Dog dog1 = new Dog();
        System.out.println(dog1);

        // Cat is an Animal
        Animal cat5 = new Cat();
        // Dog is an Animal
        Animal dog2 = new Dog();
        dog2.run();
        cat5.run();

    }

    private static int countSpecificDigit(int number, int digit) {
        if (digit < 0 || digit > 9) {
            System.out.println("Цифра должна быть в диапазоне от 0 до 9");
        }

        String numberStr = Integer.toString(number);
        char targetDigit = Integer.toString(digit).charAt(0);
        int count = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) == targetDigit) {
                count++;
            }
        }

        return count;
    }


}
