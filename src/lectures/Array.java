package lectures;

public class Array {

    public static void main(String[] args) {
        int[] myNumbers = {1, 2, 3, 4, 5, 6};
        //                 0  1  2  3
        // length = 4

        int myNumbers2[];

        for (int num : myNumbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.print(myNumbers[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < myNumbers.length; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < myNumbers.length; i++) {
            if (myNumbers[i] % 2 == 0) {
                System.out.print(myNumbers[i] + " ");
            }
        }
        System.out.println();

        System.out.println(myNumbers[myNumbers.length - 1]);

    }
}
