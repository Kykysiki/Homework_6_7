public class Main {
    public static void main(String[] args) {
        //Задание 1
        int contribution = 29000;
        int accumulation = 0;
        int month = 0;
        System.out.println("Задание - 1");
        while (accumulation <= 2_459_000) {
            accumulation *= 1.01; // 1% от суммы накомпления, ежемесячно добавляем к сумме накопления
            accumulation = contribution + accumulation; // накопления + ежемесячный взнос
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + accumulation + " рублей");
        }
        //Задание 2
        int a = 0;
        System.out.println("Задание - 2");
        while (a < 10) {
            a++;
            System.out.println(a);
        }
        for (; a > 0; a--) {
            System.out.println(a);
        }
        //Задание 3
        System.out.println("Задание - 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + (population / 1000 * (fertility - mortality));
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //Задание 4-6
        int contribution2 = 15000;
        int accumulation2 = 0;
        int month2 = 0;
        System.out.println("Задание - 4-6");
        while (month2 <= 108) {
            accumulation2 *= 1.07; //7% от суммы накомпления, ежемесячно добавляем к сумме накопления
            accumulation2 = contribution2 + accumulation2; // накопления + ежемесячный взнос
            month2++;
            if (month2 % 6 == 0) {
                System.out.println("Месяц " + month2 + ", сумма накоплений равна " + accumulation2 + " рублей");
            }
        }
        //Задание 7
        System.out.println("Задание - 7");
        int friday = 7; // номер первой пятницы месяца
        for (int days = 0; days <= 31; days++) {
            if (friday == days) { // если день совпадает с датой пятнинцы, добавляем 7 дней к значению следущей пятницы.
                friday = friday + 7;
                System.out.println("Сегодня пятница, " + days + "-е число. Необходимо подготовить отчет.");
            }
        }
        //Задание 8
        System.out.println("Задание - 8");
        int future = 2122; // +100 лет от текущего года
        int past = 1822; // -200 лет от текущего года
        while (past < future) {
            past = past + 79; // комета пролетает рядом с Землей каждый 79-й год
            if (past > future) {
                break;
            } else {
                System.out.println(past);
            }
        }
        //Задание 9
        System.out.println("Задание - 9");
        int two = 2; // постоянное значение переменной в умножении
        int m; // результат умножения
        for (int g = 1; g <= 10; g++) {
            m = two * g;
            System.out.println(two + "*" + g + "=" + m);
        }
    }
}