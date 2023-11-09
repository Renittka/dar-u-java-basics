package lectures;

public class Method {

    public static void main(String[] args) {
        printHello();
        printLearningJava();
        // lectures.DataType.doSomething();

        printHello("Анна");
        printHello("Еркебулан");
        printHello("Мария");

        printHello("Азамат", "Смит", 30);

        String hello = getHelloPerson("Anna");
        System.out.println(hello);
//        String hello = getHelloWorld();
//        hello += "!";
//        System.out.println(hello);

        int x = 10;
        int y = 5;
        int sum = getSumOfTwo(x, y);

        System.out.println(x + "+" + y + "=" + sum);

        double sumOfInts = getSum(2.5f, 2);

    }

    public static void printHello() {
        System.out.println("Привет, мир!");
    }

    public static void printLearningJava() {
        System.out.println("Я изучаю Java");
    }

    public static void printHello(String name) {
        name += "!";
        System.out.println("Привет, " + name);
    }

    public static void printHello(String name, String surname, int age) {
        String helloName = getHelloPerson(name);
        System.out.println(helloName + " " + surname + ". Возраст: " + age);
    }

    public static String getHelloPerson(String name) {
        String hello = "Привет, " + name;

        return hello;
    }

    public static void printSumOfTwo(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
    }

    public static int getSumOfTwo(int x, int y) {
        return x + y;
    }

    public static int getSum(int x, int y) {
        return x + y;
    }

    public static double getSum(double x, double y) {
        return x + y;
    }

    public static float getSum(float x, float y) {
        return x + y;
    }

}
