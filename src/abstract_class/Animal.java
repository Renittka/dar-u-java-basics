package abstract_class;

public abstract class Animal {
    protected String type;

    {
        System.out.println("Initializing");
    }

    public abstract void makeSound();

}
