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
        //cat.name = "Cat";

        Animal dog = new Animal("Dog", 10);
        Animal cat2 = new Animal("Cat 2", 5, "Black", 10);

//        System.out.println(dog.name + " " + dog.speed + " " + dog.type);
//        System.out.println(cat.name + " " + cat.speed + " " + cat.type);
//        System.out.println(cat2.name + " " + cat2.speed + " " + cat2.type);

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
