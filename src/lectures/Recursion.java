package lectures;

public class Recursion {

    public static void main(String[] args) {
        int sumOfTen = getSum(10);
        System.out.println(sumOfTen);

        int sumInRange = getSum(5, 10);
        System.out.println(sumInRange);

        int n = 3;
        int fibonacci = getFibonacci(n);
        System.out.println();
        System.out.println(n + "-e число Фибоначчи: " + fibonacci);

        int[] array = {2, 4, 6, 8, 10};
        int valueToFind = 8;
        boolean found = search(array, 0, valueToFind);

        if (found) {
            System.out.println(valueToFind + " найден в массиве");
        } else {
            System.out.println(valueToFind + " не найден в массиве");
        }
    }

    /* 0 .... 9 10
    x = 10
    10 + getSum(9)
    10 + (9 + getSum(9-1))
    10 + (9 + (8 + getSum(7)))
    ..
    10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + (1 + 0)
     */

    static int getSum(int x) {
        if (x > 0) {
            //System.out.println(x);
            return x + getSum(x - 1);
        } else {
            return 0;
        }
    }

    /*
    5 ... 10

    end = 10
    start = 5
    10 > 5
    10 + getSum(5, 9)
    10 + (9 + getSum(5, 8))
    10 + (9 + (8 + getSum(5, 7)))
    10 + 9 + 8 + 7 + 6 + getSum(5, 5)
    (10 + (9 + (8 + (7 + (6 + 5 )))))
     */

    static int getSum(int start, int end) {
        if (end > start) {
            return end + getSum(start, end - 1);
        } else {
            return end;
        }
    }

    // 0 1 1 2
    /*
    F(n) = F(n-1) + F(n-2)
    F(0) = 0
    F(1) = 1
     */

    static int getFibonacci(int n) {
        if (n <= 1) {
            System.out.print(n + " ");
            return n;
        } else {
            System.out.print(n + " ");
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    // {2, 4, 6, 8, 10};
    static boolean search(int[] arr, int index, int value) {
        System.out.println(index);
        System.out.println("Текущее значение массива: " + arr[index]);
        if (index >= arr.length) {
            return false;
        } else if (arr[index] == value) {
            return true;
        } else {
            return search(arr, index + 1, value);
        }
    }

}
