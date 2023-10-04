public class Main {
    public static void main(String[] args) {
        //Задание 1
        int valueInt = 28888888;
        long valueLong = 99991939113301030L;
        short valueShort = 30000;
        byte valueByte = 120;
        double valueDouble = 12.331413414134444;
        float valueFloat = 12.47578f;

        System.out.println("Значение переменной valueInt с типом int равно " + valueInt);
        System.out.println("Значение переменной valueLong с типом long равно " + valueLong);
        System.out.println("Значение переменной valueShort с типом short равно " + valueShort);
        System.out.println("Значение переменной valueByte с типом byte равно " + valueByte);
        System.out.println("Значение переменной valueDouble с типом double равно " + valueDouble);
        System.out.println("Значение переменной valueFloat с типом float равно " + valueFloat);

        //Задача 2

        float fValue = 27.12f;
        long lValue = 987678965549L;
        double dValue = 2.786;
        short sValue = 569;
        int iValue = -159;
        char chValue = 27897;
        byte bValue = 67;

        //Задача 3

        int studentsLudmilaPavlovna = 23;
        int studentsAnnaSergeevna = 27;
        int studentsEkaterinaAndreevna = 30;
        int totalSheetsPaper = 480;
        int sheetOneStudent = totalSheetsPaper / (studentsAnnaSergeevna + studentsEkaterinaAndreevna + studentsLudmilaPavlovna);

        System.out.println("На каждого ученика рассчитано " + sheetOneStudent + " листов бумаги");

        //Задача 4

        int machinePerformanceOneMin = 16/2;
        int time = 20;
        int bottlesPerTime = machinePerformanceOneMin * time;
        System.out.println("За 20 мин машина произвела " + bottlesPerTime + " штук бутылок");
        time = 24 * 60;
        bottlesPerTime = machinePerformanceOneMin * time;
        System.out.println("За сутки машина произвела " + bottlesPerTime + " штук бутылок");
        time = time * 3;
        bottlesPerTime = machinePerformanceOneMin * time;
        System.out.println("За 3 суток машина произвела " + bottlesPerTime + " штук бутылок");
        time = time * 10;
        bottlesPerTime = machinePerformanceOneMin * time;
        System.out.println("За месяц машина произвела " + bottlesPerTime + " штук бутылок");

        //Задача 5

        int totalCanPaint = 120;
        int oneClassCanPaint = 2 + 4;
        int totalClass = totalCanPaint / oneClassCanPaint;
        int whitePaint = 2 * totalClass;
        int brownPaint = 4 * totalClass;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + whitePaint
                + " банок белой краски и " + brownPaint + " банок коричневой краcки");

        // Задача 6

        int weightBananas = 5 * 80;
        int weightMilk = (200 / 100) * 105;
        int weightIceCream = 2 * 100;
        int weightEggs = 4 * 70;
        int totalWeightGr = weightBananas + weightMilk + weightIceCream + weightEggs;
        double totalWeightKg = (double) totalWeightGr / 1000;
        System.out.println("Вес спортзавтрака в граммах: " + totalWeightGr);
        System.out.println("Вес спортзавтрака в килограммах: " + totalWeightKg);

    }
}