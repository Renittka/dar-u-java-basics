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

    }

}
