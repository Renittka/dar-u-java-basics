import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int gradeI = 3;
        int gradeII = 3;

        System.out.println("Оценки за 1 семестр: " + gradeI + ", за 2 семестр: " + gradeII);
        System.out.println(gradeI == 5 && gradeII == 5);
        // && AND
        if (gradeI == 5 && gradeII == 5) {
            System.out.println("Молодец!");
        } else if (gradeI >= 4 || gradeII >= 4) {
            System.out.println("Хорошо!");
        } else {
            System.out.println("Постарайся лучше!");
        }

        // || OR
        /*
        if (gradeI >= 4 || gradeII >= 4) {
            System.out.println("Хорошо!");
        }

        if (10 < 5) {
            System.out.println("10 больше чем 5");
        }

         */

        int day = 5;

        switch (day) {
            case 1:
                System.out.println("Понедельник");
                System.out.println("Надо работать еще 2 дня");
                break;
            case 2:
                System.out.println("Вторник");
                System.out.println("Надо работать еще 1 день");
                break;
            case 3:
                System.out.println("Среда");
                System.out.println("Завтра выходной");
                break;
            default:
                System.out.println("Выходной");
        }

        switch (day) {
            case 1 -> {
                System.out.println("Понедельник");
                System.out.println("Надо работать еще 2 дня");
            }
            case 2 -> {
                System.out.println("Вторник");
                System.out.println("Надо работать еще 1 день");
            }
            case 3 -> {
                System.out.println("Среда");
                System.out.println("Завтра выходной");
            }
            default -> System.out.println("Выходной");
        }

    }


}