package figure;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите целое число");
//        int number = scan.nextInt();
//        System.out.println(number);


        Level myLevel = Level.LOW;
        System.out.println(myLevel.toString());

        // LOW
        // low
        // Low
        String externalLevel = myLevel.getTitle();
        System.out.println(externalLevel);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");
        String formattedDate = localDateTime.format(dateTimeFormatter);
        System.out.println(formattedDate);

    }
}
