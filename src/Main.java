public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1
        System.out.println("Домашнее задание 1.Задание 1");
        int input = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            i++;
            total = total + input;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        //Задача 2
        System.out.println("Домашнее задание 1.Задание 2");
        int a = 0;
        while (a < 10) {
        a++;
        System.out.print(" " + a);
        }
        System.out.println(" ");
        int b = 10;
        for (; b > 0; b--) {
        System.out.print(" " + b);
        }
        System.out.println(" ");
        //Задача 3
        System.out.println("Домашнее задание 1.Задание 3");
        int totalPopulation = 12000000;
        int birth = (totalPopulation / 1000) * 17;
        int death = (totalPopulation / 1000) * 8;
        int increase = birth - death;
        for (int period = 1; period <= 10; period++) {
            totalPopulation = totalPopulation + increase;
            System.out.println("Год " + period + " численность населения составляет " + totalPopulation + " человек");
        }
    }
}