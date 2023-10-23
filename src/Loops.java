public class Loops {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(1);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        System.out.println("--------");

        System.out.println("WHILE");

        int i1 = 0;
        while (i1 <= 10) {
            System.out.println(i1);
            i1++;
        }

        System.out.println("--------");

        int j = 10;
        while (j >= 0) {
            System.out.println(j);
            j--;
        }
        System.out.println("--------");

        int m = 0; // 0
        while (m < 0) {
            System.out.println(m);
            m++;
        }

        System.out.println("--------");
        System.out.println("DO-WHILE");

        int k = 0; // k = 0
        do {
            System.out.println(k); // Вывод k = 0
            k++; // 0 + 1 = 1
        } while (k == 0); // 1 == 0 ---- > false

        System.out.println("--------");
        System.out.println("FOR");

        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("--------");


        String str = "12345";
        int size = str.length();


        int number = 12345;


        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // ID сотрудника: DAR-1234
        // 1000 100  0 - 99 100 - 199
        /*
        int i = 100;
        i <= 199;
         */

        System.out.println("-------");

        // i++  ----> i = i + 1
        // i += 2 ----> i = i + 2

        // 0 1 2 3 4 5
        for (int i = 0; i <= 6; i++) {
            if (i == 3) {
                continue; // break;
            }
            System.out.println(i);
        }

        System.out.println("-------");
        int count = 0;
        while (count < 6) {
            if (count == 3) {
                count++;
                continue;
            }
            System.out.println(count);
            count++;
        }

        // 0 - count = 0
        // 1 - count = 1
        // 2 - count = 2
        // 3 - count = 3

        System.out.println("-------");
        int count2 = 0;
        while (count2 < 6) {
            if (count2 == 3) {
                break;
            }
            System.out.println(count2);
            count2++;
        }


    }
}
