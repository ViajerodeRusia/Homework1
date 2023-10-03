import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;
public class Main {
    // BEGIN
    public static void main(String[] args) {
        var weightBoxer1 = 78.2f;
        var weightBoxer2 = 82.7f;
        System.out.println("Масса бойца №1 = " + weightBoxer1);
        System.out.println("Масса бойца №2 = " + weightBoxer2);
        System.out.println("Разница масс спортсменов 1 способ = " + (weightBoxer2 - weightBoxer1));
        System.out.println("Разница масс спортсменов 2 способ = " + (weightBoxer2 % weightBoxer1));
    }
}
// END

