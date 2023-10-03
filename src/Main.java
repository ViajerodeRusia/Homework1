import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;
public class Main {
    // BEGIN
    public static void main(String[] args) {
        var dog = 8.0f;
        var cat = 3.6f;
        var paper = 763789;
        System.out.println("dog = " + dog + " - 3.5 = " +(dog-3.5f));
        System.out.println("cat = " + cat + " - 1.6 = " +Math.round(cat-1.6f));
        System.out.println("paper = " + paper + " - 7639 = " +(paper-7639));
    }
}
// END

