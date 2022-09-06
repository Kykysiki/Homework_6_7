public class Main {
    public static void main(String[] args) {
        //Задание 1
        int i;
        System.out.println("Задние - 1");
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Задание 2
        int a;
        System.out.println("Задние - 2");
        for (a = 10; a >= 1; a--) {
            System.out.println(a);
        }
        //Задание 3
        int b;
        System.out.println("Задние - 3");
        for (b = 2; b <= 17; b = b + 2) {
            System.out.println(b);
        }
        //Задание 4
        int с;
        System.out.println("Задние - 4");
        for (с = 10; с >= -10; с--) {
            System.out.println(с);
        }
        //Задание 5
        int f;
        System.out.println("Задние - 5");
        for (f = 1904; f <= 2096; f=f+4) {
            System.out.println(f);
        }
        //Задание 6
        int v;
        System.out.println("Задние - 6");
        for (v = 1; v <= 512; v=v*2) {
            System.out.println(v);
        }
        //Задание 7
        int m = 29000;
        int y = 0;
        System.out.println("Задние - 7");
        for (int z = 1; z <= 12; z++) {
            y=m+y;
            System.out.println("Месяц "+z+", сумма накоплений равна "+y+" рублей");
        }
        //Задание 8
        int j = 29000;
        int k = 0;
        System.out.println("Задние - 8");
        for (int z = 1; z <= 12; z++) {
            k=k+k/100;
            k=j+k;
            System.out.println("Месяц "+z+", сумма накоплений равна "+k+" рублей");
        }
    }
}