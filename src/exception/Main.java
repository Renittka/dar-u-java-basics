package exception;

import java.util.UUID;

public class Main {
    class Student {
        private UUID id;
        private String name;
    }

    public static void main(String[] args) {

        UUID randomId = UUID.randomUUID();

        int[] myIntegers = {1, 2, 3};
        try {
            int i = myIntegers[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetic exception");
        } catch (Exception ex) {
            System.out.println();
        } finally {
            System.out.println("Процесс завершен");
        }
        System.out.println(myIntegers[0]);

    }
}
