package lectures;

public class Array2D {

    public static void main(String[] args) {
        /*
        int[][] array = new int[4][4]
        0 1 2 3 4
        1 1 1 1 1
        2 1 1 1 1
        3 1 1 1 1
        4 1 1 1 1
         */
        int[][] array = new int[4][4];

        /*
        int i = 0;
             j = 0; array[0][0]
             j = 1; array[0][1]
             j = 2; array[0][2]
             j = 3; array[0][3]
             j = 4; array[0][4]
        int i = 1
             j = 0; array[1][0]
             j = 1; array[1][1]
             j = 2; array[1][2]
             j = 3; array[1][3]
             j = 4; array[1][4]
         */
        System.out.println(array.length);
        System.out.println(array[0].length);

        // Variant I
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Variant II
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        int[][] myNums = {{1, 2, 3}, {5, 6, 7}, {3, 45, 67}};

        System.out.println("myNums[1][1]: " + myNums[1][1]);

        for (int i = 0; i < myNums.length; i++) {
            for (int j = 0; j < myNums[i].length; j++) {
                if (i == j) {
                    System.out.print(myNums[i][j] + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

        System.out.println("---------");
        int[][] array2D = new int[2][2];
        array2D[0][0] = 1;
        array2D[0][1] = 2;
        array2D[1][0] = 1;
        array2D[1][1] = 3;

        System.out.println(array2D[0][1]);
        for (int[] row : array2D) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.println("array[" + i + "]" + "[" + j + "]: " + array2D[i][j] + " array 2D length " + array2D.length);
            }
        }

        System.out.println("--------");
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.printf("array[%d][%d]: %d array \\ %%  \t %s %d\n", i, j, array2D[i][j], "2D length", array2D.length);
            }
        }

    }
}
