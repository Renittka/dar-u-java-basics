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

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }


    }
}
