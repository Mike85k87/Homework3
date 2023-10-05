public class Main {
    public static void main(String[] args) {
        //* Задача 1
        System.out.println("Task 1");
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4345;
        float e = 4.45f;
        double t = 345.567;
        System.out.println("Значение переменной a с типом byte равно "+a);
        System.out.println("Значение переменной b с типом short равно "+b);
        System.out.println("Значение переменной c с типом int равно "+c);
        System.out.println("Значение переменной d с типом long равно "+d);
        System.out.println("Значение переменной e с типом float равно "+e);
        System.out.println("Значение переменной t с типом double равно "+t);

        //* Задача 2
        System.out.println("Task 2 - смотри внутрь кода");
        float aa = 27.12f;
        long bb = 987678965549L;
        double cc = 2.786;
        short dd = 569;
        short ee = -159;
        int ff = 27897;
        byte gg = 67;

        //* Задача 3
        System.out.println("Task 3");
        int s1 = 23;
        int s2 = 27;
        int s3 = 30;
        int pages = 480;
        System.out.println("Количество листов на одного ученика " + (pages/(s1+s2+s3)) + " штук");

        //* Задача 4
        System.out.println("Task 4");
        int pmin2 = 16; //* Производительность за 2 минуты
        int pmin20 = pmin2*20/2; //* Производительность за 20 минут
        int pday1 = pmin2*24*60/2; //* Производительность за сутки
        int pday3 = pday1*3; //* Производительность за 3 дня
        int pmonth = pday1*30; //* Производительность за месяц
        System.out.println("За 20 минут машина произвела " + pmin20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + pday1 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + pday3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + pmonth + " штук бутылок");

        //* Задача 5
        System.out.println("Task 5");
        int allb = 120; //* Количество банок
        int whitePaint1 = 2; //* Количество банок белой краски на один класс
        int brownPaint1 = 4; //* Количество банок коричневой краски на один класс
        int classes = allb/(whitePaint1 + brownPaint1); //* Количество классов в школе
        int whitePaint = classes * whitePaint1; //* Количество банок белой краски всего
        int brownPaint = classes * brownPaint1; //* Количество банок коричневой краски всего
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        //* Задача 6
        System.out.println("Task 6");
        int mBanana = 80; //* Вес одного банана в граммах
        int mMilk = 105; //* Вес 100 мл молока в граммах
        int mIceCream = 100; //* Вес одного брикета мороженого в граммах
        int mEgg = 70; //* Вес одного яйца в граммах
        int mCocktail = mBanana*5 + mMilk*2 + mIceCream*2 + mEgg*4; //* Вес одного коктейля в граммах
        double mCocktailKg = mCocktail/1000.00; //* Вес одного котейля в килограммах
        System.out.println("В одном коктейле " + mCocktail + " граммов или " + mCocktailKg + " килограммов");

        //* Задача 7
        System.out.println("Task 7");
        int mass = 7000; //* Вес, который необходимо скинуть спортсмену в граммах
        int day250 = mass/250; //* Количество дней, если будет сбрасывать по 250 грамм
        int day500 = mass/500; //* Количество дней, если будет сбрасывать по 500 грамм
        System.out.println("Спортсмен сбросит 7 килограмм за " + day250 + " дней, при похудении на 250 грамм в день");
        System.out.println("Спортсмен сбросит 7 килограмм за " + day500 + " дней, при похудении на 500 грамм в день");

        //* Задача 8
        System.out.println("Task 8");
        int Masha = 67760; //* Доход Маши в месяц до повышения зп
        int Denis = 83690; //* Доход Дениса в месяц до повышения зп
        int Kristina = 76230; //* Доход Кристины в месяц до повышения зп
        float Masha10 = (float) (Masha * 1.1); //* Доход Маши в месяц после повышения зп
        float Denis10 = (float) (Denis * 1.1); //* Доход Дениса в месяц после повышения зп
        float Kristina10 = (float) (Kristina * 1.1); //* Доход Кристины в месяц после повышения зп
        int MashaYear = Masha * 12; //* Годовой доход Маши до повышения зп
        int DenisYear = Denis * 12; //* Годовой доход Дениса до повышения зп
        int KristinaYear = Kristina * 12; //* Годовой доход Кристины до повышения зп
        float MashaYear10 = Masha10 * 12; //* Годовой доход Маши после повышения зп
        float DenisYear10 = Denis10 * 12; //* Годовой доход Дениса после повышения зп
        float KristinaYear10 = Kristina10 * 12; //* Годовой доход Кристины после повышения зп
        System.out.println("Маша теперь получает " + Masha10 + " рублей. Годовой доход вырос на " + (MashaYear10 - MashaYear) + " рублей");
        System.out.println("Денис теперь получает " + Denis10 + " рублей. Годовой доход вырос на " + (DenisYear10 - DenisYear) + " рублей");
        System.out.println("Кристина теперь получает " + Kristina10 + " рублей. Годовой доход вырос на " + (KristinaYear10 - KristinaYear) + " рублей");

    }
}