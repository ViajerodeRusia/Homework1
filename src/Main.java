import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import org.apache.commons.lang3.StringUtils;
public class Main {
    // BEGIN
    public static void main(String[] args) {
        //Задача1
        var dog = 8.0f;
        var cat = 3.6f;
        var paper = 763789;
        System.out.println("Задача 1");
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        System.out.println();
        //Задача2
        System.out.println("Задача 2");
        System.out.println("dog = " + dog + " + 4 = " +(dog+4));
        System.out.println("cat = " + cat + " + 4 = " +(cat+4));
        System.out.println("paper = " + paper + " + 4 = " +(paper+4));
        System.out.println();
        //Задача3
        System.out.println("Задача 3");
        System.out.println("dog = " + dog + " - 3.5 = " +(dog-3.5f));
        System.out.println("cat = " + cat + " - 1.6 = " +Math.round(cat-1.6f));
        System.out.println("paper = " + paper + " - 7639 = " +(paper-7639));
        System.out.println();
        //Задача4
        var friend = 19;
        System.out.println("Задача 4");
        System.out.println("friend = " + friend);
        System.out.println("friend = "+ friend + " + 2 = " +(friend+2));
        System.out.println("friend = "+ friend + " / 7 = " +(friend/7));
        System.out.println();
        //Задача5
        var frog = 3.5f;
        System.out.println("Задача 5");
        System.out.println("frog = " + frog);
        System.out.println("frog = "+ frog + " * 10 = " +Math.round(frog*10));
        System.out.println("frog = "+ frog + " / 3.5 = " +Math.round(frog/3.5f));
        System.out.println("frog = "+ frog + " + 4 = " +(frog+4));
        System.out.println();
        //Задача6
        var weightBoxer1 = 78.2f;
        var weightBoxer2 = 82.7f;
        System.out.println("Задача 6");
        System.out.println("Масса бойца №1 = " + weightBoxer1);
        System.out.println("Масса бойца №2 = " + weightBoxer2);
        System.out.println("Общая масса двух бойцов = " + (weightBoxer1+weightBoxer2));
        System.out.println();
        //Задача7
        System.out.println("Задача 7");
        System.out.println("Масса бойца №1 = " + weightBoxer1);
        System.out.println("Масса бойца №2 = " + weightBoxer2);
        System.out.println("Общая масса двух бойцов = " + (weightBoxer1+weightBoxer2));
        System.out.println("Разница масс спортсменов 1 способ = " + (weightBoxer2 - weightBoxer1));
        System.out.println("Разница масс спортсменов 2 способ = " + (weightBoxer2 % weightBoxer1));
        System.out.println();
        //Задача8
        var workingHoursTotal = 640;
        var eachWorkerHours = 8;
        var numberOfWorkers = workingHoursTotal/eachWorkerHours;
        System.out.println("Задача 8");
        System.out.println("Всего часов работы - " + workingHoursTotal + "ч");
        System.out.println("Каждый работник работает -  " + eachWorkerHours + "ч");
        System.out.println("Число работникв = " + numberOfWorkers + " человек");
        System.out.println();
    }
}
// END

