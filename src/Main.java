public class Main {
    public static void main(String[] args) {
        //Задание 1
        int j = 29000;
        int k = 0;
        int v = 0;
        System.out.println("Задание - 1");
        while (k <= 2_459_000) {
            k=k+k/100;
            k=j+k;
            v++;
            System.out.println("Месяц "+v+", сумма накоплений равна "+k+" рублей");
        }
        //Задание 2
        int a = 0;
        System.out.println("Задание - 2");
        while (a < 10) {
            a++;
            System.out.println(a);
        }
        for (;a>0;a--){
            System.out.println(a);
        }
        //Задание 3
        int y = 12_000_000;
        System.out.println("Задание - 3");
        for (int year=1; year<=10; year++){
            y=y+(y/1000*9);
            System.out.println("Год "+year+", численность населения составляет "+y);
        }
        //Задание 4-6
        int vklad = 15000;
        int nakoplen = 0;
        int mes = 0;
        System.out.println("Задание - 4-6");
        while (mes <= 108) {
            nakoplen=nakoplen+nakoplen/100*7;
            nakoplen=vklad+nakoplen;
            mes++;
            if (mes % 6 == 0) {
                System.out.println("Месяц " + mes + ", сумма накоплений равна " + nakoplen + " рублей");
            }
        }
        //Задание 7
        System.out.println("Задание - 7");
        int friday = 7;
        for (int days=0; days<=31; days++) {
            if (friday == days) {
                friday=friday+7;
                System.out.println("Сегодня пятница, "+days+"-е число. Необходимо подготовить отчет.");
            }
        }
        //Задание 8
        System.out.println("Задание - 8");
        int future = 2122;
        int past = 1822;
        while (past<future) {
            past = past+79;
            if (past>future){
                break;
            }
            else {
                System.out.println(past);
            }
        }
        //Задание 9
        System.out.println("Задание - 9");
        int two = 2;
        int m;
        for (int g=1;g<=10;g++){
            m=two*g;
            System.out.println(two+"*"+g+"="+m);
        }
    }
}