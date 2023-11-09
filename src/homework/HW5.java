package homework;

public class HW5 {

    public static void main(String[] args) {

        // Task 5.1
        int a = 10;
        int b = 5;
        boolean isSquare = false;

        if (a == b) {
            isSquare = true;
        }

        System.out.println(isSquare);

        // Task 5.2
        int total = 10000;

        /*if (total >= 5000) {
            total *= 0.9;
        }

        System.out.println(total);
         */

        // Тернарная запись
        System.out.println((total >= 5000) ? total *= 0.9 : total);


        // Task 5.3
        int grade = 100;
        char letterGrade = 0;

        /*
        Ниже 25 - F
        От 25 до 45 - E
        От 45 до 50 - D
        От 50 до 60 - C
        От 60 до 80 - B
        Выше 80 - A
         */
        if (grade >= 0 && grade <= 25) {
            letterGrade = 'F';
        } else if (grade > 25 && grade <= 45) {
            letterGrade = 'E';
        } else if (grade > 45 && grade <= 50) {
            letterGrade = 'D';
        } else if (grade > 50 && grade <= 60) {
            letterGrade = 'C';
        } else if (grade > 60 && grade <= 80) {
            letterGrade = 'B';
        } else if (grade > 80 && grade <= 100) {
            letterGrade = 'A';
        } else {
            System.out.println("Incorrect value");
        }

        System.out.println("Grade: " + grade + ", letter: " + letterGrade);

        // Task 5.4
        int originalNumber = 12345;
        String numberStr = Integer.toString(originalNumber); // "12345" s.length()
        StringBuilder reversedNumber = new StringBuilder(); // 54321

        System.out.println("Original: " + originalNumber);

        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversedNumber.append(numberStr.charAt(i));
            // System.out.println(numberStr.charAt(i));
        }

        /*
        String reversedNumber2 = ""; // 54321

        for (int i = numberStr.length() - 1; i >= 0; i--) {
            reversedNumber2 += numberStr.charAt(i);
        }

         */

        int reversedNumberInt = 0;

        while (originalNumber > 0) {
            int remainder = originalNumber % 10;
            System.out.println("Remainder: " + remainder);
            reversedNumberInt = reversedNumberInt * 10 + remainder;
            System.out.println("Temp reversedNumber: " + reversedNumberInt);
            originalNumber /= 10;
        }

        System.out.println("Reversed number: " + reversedNumberInt);

        // 12345
        /*
        0 - 12345 - 5  - 5
        1 - 1234 - 4 - 54
        2 - 123 - 3 - 543
        3 - 12 - 2 - 5432
        4 - 1 - 1 - 54321
        5 - 0 -----

        54321

         */

        // Task 5.5
        int n = 5;
        boolean isComposite = false;

        if (n % 2 == 0) {
            isComposite = false;
        } else {
            for (int i = 3; i < n; i++) {
                if (n % i == 0) {
                    isComposite = true;
                    break;
                }
            }
        }

        if (isComposite) {
            System.out.println("Составное число");
        } else {
            System.out.println("Простое число");
        }

        // Task 5.6
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
            /*
            int i = 0: {
            j = 0: *
            j = 1: **
            j = 9: **********
            j = 10 -----
            }
            int i = 1: {
            j: 0
            **********
            *
            j = 1:
            **********
            **
            j = 9
            **********
            **********
            }
            int i = 0 **********
            i = 1
            **********
            **********

            i = 2
            **********
            **********
            **********
            i = 3
            **********
            **********
            **********
            **********

             */
        }

        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Task 5.7
        int end = 10;
        int sum = 0;

        // start = 5 --> sum = 0 + 5
        // start = 6 --> sum = 5 + 6

        int start = 5;
        for (int counter = start; counter <= end; counter++) {
            sum += counter;
        }

        System.out.println("От " + start + " до " + end + ": " + sum);

        // Task 5.8
        double salary = 200000;
        char employeeGrade = 'B';

        switch (employeeGrade) {
            case 'A' -> salary *= 1.5;
            case 'B' -> salary *= 1.25;
        }

        System.out.println("Result salary: " + salary);

        // Task 5.9
        int number = 5;
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        // 1 1 2
        for (int i = 3; i <= number; i++) {
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }

        System.out.println();
        int[] array = new int[number];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        for (int j : array) {
            System.out.print(j + " ");
        }

    }

}
