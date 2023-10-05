public class Main {
    // BEGIN
    public static void main(String[] args) {
        //Задача1
        byte variableByte = -128;
        short variableShort = -32768;
        long variableLong = -9000000000L;
        float variableFloat = 3.4569578f;
        double variableDouble = 3.5646578f;
        System.out.println("Задача 1");
        System.out.println("Значение переменной variableByte с типом byte равно " + variableByte);
        System.out.println("Значение переменной variableShort с типом short равно " + variableShort);
        System.out.println("Значение переменной variableLong с типом long равно " + variableLong);
        System.out.println("Значение переменной variableFloat с типом float равно " + variableFloat);
        System.out.println("Значение переменной variableDouble с типом double равно " + variableDouble);
        System.out.println();
        //Задача2
        float x1 = 27.12f;
        long x2 = 987678965549L;
        float x3 = 2.786f;
        short x4 = 569;
        short x5 = -159;
        short x6 = 27897;
        byte x7 = 67;
        System.out.println("Задача 2");
        System.out.println("float => " + x1);
        System.out.println("long => " + x2);
        System.out.println("float => " + x3);
        System.out.println("short => " + x4);
        System.out.println("short => " + x5);
        System.out.println("short => " + x6);
        System.out.println("byte => " + x7);
        System.out.println();
        //Задача3
        byte ludmylaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short totalStudents = 480;
        byte paperForEach = (byte) Math.round(totalStudents/(ludmylaPavlovna+annaSergeevna+ekaterinaAndreevna));
        System.out.println("Задача 3");
        System.out.println("Студентов у Людмилы Павловны => "+ludmylaPavlovna);
        System.out.println("Студентов у Анны Сергеевны => "+annaSergeevna);
        System.out.println("Студентов у Екатерины Андреевны => "+ekaterinaAndreevna);
        System.out.println("Куплено бумаги => "+totalStudents);
        System.out.println("Каждый студент получит => "+paperForEach);
        System.out.println();
        //Задача4
        byte efficiency = 16/2;
        byte time1 = 20;
        short time2 = 24 * 60;
        short time3 = (short) (3 * time2);
        int time4 = 31 * time2;
        short machineEfficiency1 = (short) (time1 * efficiency);
        short machineEfficiency2 = (short) (time2 * efficiency);
        int machineEfficiency3 = time3 * efficiency;
        int machineEfficiency4 = time4 * efficiency;
        System.out.println("Задача 4");
        System.out.println("За минуту машина произвела " + efficiency + " бутылок");
        System.out.println("За 20 минут машина произвела " + machineEfficiency1 + " бутылок");
        System.out.println("За сутки машина произвела " + machineEfficiency2 + " бутылок");
        System.out.println("За 3 дня машина произвела " + machineEfficiency3 + " бутылок");
        System.out.println("За месяц машина произвела " + machineEfficiency4 + " бутылок");
        System.out.println();
        //Задача5
        byte paintCansNeeded = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        System.out.println("Задача 5");
        System.out.println("В школе, где " + (paintCansNeeded/(whitePaint+brownPaint)) +
                " классов, нужно " + (paintCansNeeded*whitePaint/(whitePaint+brownPaint)) +
                        " банок белой краски и " + (paintCansNeeded*brownPaint/(whitePaint+brownPaint)) +
                        " банок коричневой краски");
        System.out.println();
        //Задача6
        byte bananaGram = 80;
        float milkGram = (float) (105/100);
        byte icecreamGram = 100;
        byte eggsGram = 70;
        byte bananaBreakfast = 1;
        short milkBreakfast = 200;
        byte icecreamBreakfast = 2;
        byte eggsBreakfast = 4;
        System.out.println("Задача 6");
        System.out.println("Масса завтрака в граммах = " + (short)(bananaGram*bananaBreakfast+milkGram*milkBreakfast+
                icecreamGram*icecreamBreakfast+eggsGram*eggsBreakfast)+ "г");
        System.out.println("Масса завтрака в киллограммах = " + ((bananaGram*bananaBreakfast+milkGram*milkBreakfast+
                icecreamGram*icecreamBreakfast+eggsGram*eggsBreakfast)/1000) + "кг");
        System.out.println();
        //Задача7
        byte aimKg = 7;
        short minGram = 250;
        short maxGram = 500;
        System.out.println("Задача 7");
        System.out.println("Если будет худеть по " + minGram + "грамм в день, то сбросит 7 кг за " + (byte)(aimKg*1000/minGram)+ " дн");
        System.out.println("Если будет худеть по " + maxGram + "грамм в день, то сбросит 7 кг за " + (byte)(aimKg*1000/maxGram)+ " дн");
        System.out.println("В среднем потребуется " + (byte) ((aimKg*1000/minGram)+(aimKg*1000/maxGram)) + " дн");
        System.out.println();
        //Задача8
        int mashaCurrent = 67760;
        int denisCurrent = 83690;
        int kristinaCurrent = 76230;
        System.out.println("Задача 8");
        System.out.println("Маша теперь получает " +(int) (mashaCurrent*1.1)+ "руб. " +
                "Годовой доход вырос на " + (int)((12*mashaCurrent*1.1)%(mashaCurrent*12))+"руб.");
        System.out.println("Маша теперь получает " +(int) (denisCurrent*1.1)+ "руб. " +
                "Годовой доход вырос на " + (int)((12*denisCurrent*1.1)%(denisCurrent*12))+"руб.");
        System.out.println("Маша теперь получает " + (int) (kristinaCurrent*1.1)+ "руб. " +
                "Годовой доход вырос на " + (int)((12*kristinaCurrent*1.1)%(kristinaCurrent*12))+"руб.");
        System.out.println();
    }
}
// END

