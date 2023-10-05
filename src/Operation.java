public class Operation {
    public static void main(String[] args) {

        final double G = 9.8;
        final String MY_CITY = "Kokshetau";

        // Narrowing
        double d = 24.5;
        int a = (int) d;
        System.out.println("Result of narrowing: " + a);

        // 24   --> 0.5
        // 24.0
        float f = a;
        System.out.println("Result: " + f);

        // Widening
        byte b = 7;
        int i = b;
        System.out.println("Result of widening: " + i);

        float f1 = 24.5f;
        double d1 = f1;
        System.out.println("Result of  float-double: " + d1);

        System.out.println(20 / 2);

        int result = 20 / 2;
        int doubleResult = (int) (20 / 2.7);
        double doubleRes = 20 / 2.7;
        System.out.println(doubleResult);
        System.out.println(doubleRes);

        a = 20;
        System.out.println("Original: " + a);
        System.out.println("Prefix increment: " + (++a));
        System.out.println("Postfix increment: " + (a++));
        System.out.println("Final: " + a);

        System.out.println("------------");
        a = 20;
        System.out.println("Original: " + a);
        System.out.println("Prefix decrement: " + (--a)); //1. a = a - 1 = 20 - 1; 2. Вывод
        System.out.println("Postfix decrement: " + (a--)); // 1. Вывод 2. 19 - 1 = 18
        System.out.println("Final: " + a);

        int sum = a + ++b;
        System.out.println(sum);

        System.out.println("------------");

        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println(i1);
        }
        System.out.println("------------");

        for (int i1 = 5; i1 > 0; i1++) {
            System.out.println(i1);
        }

        char ch = 'C';


    }

}
