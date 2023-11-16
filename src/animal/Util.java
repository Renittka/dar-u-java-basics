package animal;

import java.time.LocalDate;
import java.util.Date;

public class Util {

    public static final String DATE_PATTERN = "dd-mm-yyyy";

    public static LocalDate getFormattedDate() {
        // format date
        return LocalDate.now();
    }

}
