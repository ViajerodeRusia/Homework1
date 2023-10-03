import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;
public class Main {
    // BEGIN
    public static void main(String[] args) {
        var workingHoursTotal = 640;
        var eachWorkerHours = 8;
        var numberOfWorkers = workingHoursTotal/eachWorkerHours;
        System.out.println("Всего часов работы - " + workingHoursTotal + "ч");
        System.out.println("Каждый работник работает -  " + eachWorkerHours + "ч");
        System.out.println("Число работникв = " + numberOfWorkers + " человек");

    }

}
// END

