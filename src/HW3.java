public class HW3 {

    public static void main(String[] args) {

        int b = 5;
        int a = 10;

        String flowersName = "Roses";
        final String MY_COMPANY_DAR_UNIVERSITY = "DAR U";

        boolean result = a == b;
        System.out.println(a + " == " + b + ": " + result);
        System.out.println(a + " > " + b + ": " + (a > b));
        System.out.println(a + " < " + b + ": " + (a < b));
        System.out.println(a + " != " + b + ": " + (a != b));
        System.out.println(a + " >= " + b + ": " + (a >= b));
        System.out.println(a + " <= " + b + ": " + (a <= b));

        /*
         1       2      AND     OR      NOT     XOR
     1  true    true    true    true    false   false
     2  true    false   false   true    false   true
     3  false   true    false   true    true    true
     4  false   false   false   false   true    false
         */

        int c = 7;

        System.out.println(a > b);
        System.out.println(b > c);
        System.out.println(a > b & b > c);
        System.out.println(a > b | b > c);
        System.out.println(!(a > b));
        System.out.println(a > b ^ b < c);

        /*
        | - OR
        shortcut: || - OR
        a > b | b > c
        true true - true
        true false - true

        a > b || b > c
        true  ---> true
        false -  false   ---> false
        false -  true    ---> true

        &
        a > b & b > c
        false -- false  ------> false
        true --- true  ----> true
        false

        &&
        a > b && (b > c && d < b && b > k)
        false   ------> false
         */

        int e = 40;
        int d = 10;
        if (e > d || 20 < 10) {
            System.out.println(e + " больше чем " + d);
        }

        if (e < 0) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Все хорошо");
        }

        printHelloWithTime();

        String day = "MONDAY";
        String weekDay = getWeekDay(day);

        switch (weekDay) {
            case "MONDAY" -> System.out.println("Понедельник");
            case "TUESDAY" -> {
                System.out.println("Вторник");
                System.out.println("Пора работать");
            }
            case "WEDNESDAY" -> System.out.println("Среда");
            default -> System.out.println("Выходной");

        }

    }

    public static void printHelloWithTime() {
        int time = 20;
        int alarm;

        if (time >= 1 && time < 18) { // false
            alarm = time;
            System.out.println("Добрый день! Время будильника: " + alarm);
        } else if (time >= 18 && time <= 21) { // false
            alarm = time;
            System.out.println("Добрый вечер");
        } else if (time > 21 && time <= 24) { // false
            alarm = time;

            System.out.println("Доброй ночи");
        } else {
            System.out.println("Введите корректное значение времени");
        }
    }

    public static String getWeekDay(String day) {
        String weekDay;

        switch (day) {
            case "MONDAY" -> weekDay = "Понедельник";
            case "TUESDAY" -> weekDay = "Вторник";
            case "WEDNESDAY" -> weekDay = "Среда";
            default -> weekDay = "Выходной";
        }

        return weekDay;
    }

}
