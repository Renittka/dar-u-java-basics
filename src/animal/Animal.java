package animal;

public class Animal {
    String name;
    int age = 5;
    String type;
    int speed;

    public Animal() {
        name = "Animal";
        age = 0;
        type = "";
        speed = 0;
    }

    public Animal(String name) {
        this.name = name;
        //name = newName;
    }

    public Animal(String name, int age) {
        this(name);
        this.age = age;
    }

    public Animal(String name, int age, String type) {
        this(name, age);
        this.type = type;
    }

    public Animal(String name, int age, String type, int speed) {
        this(name, age, type);
        this.speed = speed;
    }

    public void run() {
        if (speed == 0) {
            System.out.println("Stopped");
        } else {
            System.out.println("Running with speed: " + speed);
        }
    }


    @Override
    public String toString() {
        return name + " " + type + " " + age;
    }

//    public void run(int speed) {
//        System.out.println("Running with speed: " + speed);
//    }


}
