import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;
public class Main {
    // BEGIN
    public static void main(String[] args) {
        var frog = 3.5f;
        System.out.println("frog = " + frog);
        System.out.println("frog = "+ frog + " * 10 = " +Math.round(frog*10));
        System.out.println("frog = "+ frog + " / 3.5 = " +Math.round(frog/3.5f));
        System.out.println("frog = "+ frog + " + 4 = " +(frog+4));
    }
}
// END

