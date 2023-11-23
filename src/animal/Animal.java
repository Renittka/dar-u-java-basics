package animal;

public class Animal {
    private String name;
    private int age = 5;
    private String type;
    private int speed;

    public Animal() {
        name = "Animal";
        age = 0;
        type = "";
        speed = 0;
    }

    public Animal(String name) {
        //name = newName;
        this.name = name;
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

    /*
    private String name;
    private int age = 5;
    private String type;
    private int speed;
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    Error
//    public String setName(String name) {
//        return name;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run() {
        if (speed == 0) {
            System.out.println("Stopped");
        } else {
            System.out.println("Running with speed: " + speed);
        }
    }

    public void printInfo() {
        // Option 1
        String info = String.format("Name: %s, type: %s, age: %d, speed: %d", name, type, age, speed);
        System.out.println(info);

        // Option 2
        System.out.printf("Name: %s, type: %s, age: %d, speed: %d \n", name, type, age, speed);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, type: %s, age: %d, speed: %d", name, type, age, speed);
    }

//    public void run(int speed) {
//        System.out.println("Running with speed: " + speed);
//    }


}
