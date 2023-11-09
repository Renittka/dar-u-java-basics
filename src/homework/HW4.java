package homework;

public class HW4 {

    public static void main(String[] args) {

        // Task 4.1
        int firstNumber = 10;
        int secondNumber = 5;

        System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber * secondNumber);

        // Task 4.2
        int a = 20;
        double b = 2.5;

        double result = a / b;

        System.out.println(result);

        // Task 4.3
        int c = 15;
        int d = 9;

        int p = 2 * (c + d);
        int s = c * d;

        System.out.println("Perimeter: " + p);
        System.out.println("Area: " + s);

        // Task 4.4
        int x = 10;

        System.out.println(++x); // 11
        System.out.println(x++); // 11
        System.out.println(x); // 12
        System.out.println("-------");
        System.out.println(--x); // 11
        System.out.println(x--); // 11
        System.out.println(x); // 10

        // Task 4.5
        x += 5;
        x = x + 5;

        System.out.println(x);

        // Task 4.6
        int h = 25;
        int j = 43;

        boolean isEqual = h == j;

        boolean isSorted;
        boolean isActive;

        System.out.println(h + " == " + j + ": " + isEqual);


        // Task 4.7

        int y = 20;
        int z = 5;
        int reminder = y % z;

        System.out.println(reminder);

        if (y % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        if (y % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Четное");
        }

        // Task 4.9
        int o = 451;
        result = (Math.abs((451 + 10) / 3) + 5) * 5;

        System.out.println(result);

        // Task 4.10
        a = 65;
        b = 80;
        boolean isALess50 = a < 50; // false
        boolean isALessB = a < b;  // true

        // && ----> true --- > true true

        System.out.println("a < 50 && a < b: " + (isALess50 && isALessB));
        System.out.println("a < 50 || a < b: " + (isALess50 || isALessB));

    }
}
