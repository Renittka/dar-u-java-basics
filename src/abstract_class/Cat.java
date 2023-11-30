package abstract_class;

public class Cat extends Animal implements Runnable, Swimmable {

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    public void run() {
        System.out.println("Running ... ");
    }

    @Override
    public void swim() {

    }
}
