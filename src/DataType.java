public class DataType {

    public static void main(String[] args) {

        //char letterA = 'A';

        char gradeA = 'A';
        char gradeB = 'B';
        char gradeC = 'C';

        System.out.println("Result: " + 20 + 20);
        System.out.println("Result: " + (20 + 20));
        System.out.println(20 + 20);

        short a = 20;
        short b = -20;
        System.out.println(a + b);
        System.out.println(a - b);
        a = 40;
        System.out.println(a);
        System.out.println(b);

        byte c = 10;
        int d = -20;
        int f2 = 20;
        long l = 20L;

        int result = d + f2;
        System.out.println(d + "+" + f2 + "=" + result);
        System.out.println("Long: " + l);

        double g = 2.5;
        float f = 34.8f;

        System.out.println(g);
        System.out.println(f);

        // System.out.println(letterA);
        char letterA = 65, letterB = 66;

        char myNewLetterD = 68;

        System.out.println(letterA);

        boolean flag = true;
        System.out.println(flag);
        flag = false;

        boolean flag1 = false;

        System.out.println(flag);

        String str = null;
        System.out.println(str);

        System.out.println(str);

        str = "Я изучаю java";
        System.out.println(str);

        int a1 = 5, b1 = 6;
        System.out.println(a1 + b1);

        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);


        String name = "Maria";
        char charM = 65;
        System.out.println("CHAR: " + charM);
        System.out.println("Hello, " + name + "! " + 123 + 123);

        final double PI = 3.14;
        final double myPI = 3.14;

        int myNumber = 5;
        int mynumber = 10;

        /*
        System.out.println("привет, мир!");
        System.out.println("1 + 5 = " + (1 + 5));
        System.out.println("Java");
        System.out.print(". Без перехода на новую строку");
        System.out.print(" 1");
        System.out.print(" 2");
        System.out.print(" 3");

        // Однострочный комментарий
        */

        int ab = 12;

        System.out.println(ab);

        String helloWorld = "Hello World!";
        System.out.println(helloWorld);

        helloWorld = "Hello, Java!";
        System.out.println(helloWorld);

        doSomething();

    }

    static void doSomething() {
        int a = 10;
        System.out.println(a);
    }

}
