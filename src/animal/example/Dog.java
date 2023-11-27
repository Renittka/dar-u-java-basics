package animal.example;

public class Dog extends Animal {

    @Override
    public String toString() {
        return "Dog: " + super.toString();
    }

    @Override
    public void run() {
        if (speed == 0) {
            System.out.println("Dog is stopped");
        } else {
            System.out.println("Dog is running with speed: " + speed);
        }
    }

    public void run(int speed) {

    }

}
