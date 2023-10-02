public class Main {

    public static void main(String[] args) {

        // Narrowing
        double d = 24.5;
        int a = (int)d;
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
    }


}