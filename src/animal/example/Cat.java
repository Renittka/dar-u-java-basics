package animal.example;

public class Cat extends Animal {
    private String furType;

    public Cat() {

    }

    public Cat(String furType) {
       // super();
        this.furType = furType;
    }

    public Cat(String name, String furType, int age, String type) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.furType = furType;
        //speed = 5;
    }

    public Cat(String name, String furType, int age, int speed, String type) {
        super(name, age, type, speed);
        this.furType = furType;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    @Override
    public String toString() {
        return "Cat: " + super.toString() + ", furType: " + furType;
    }

    @Override
    public void run() {
        if (speed == 0) {
            System.out.println("Cat is stopped");
        } else {
            System.out.println("Cat is running with speed: " + speed);
        }
    }

}
