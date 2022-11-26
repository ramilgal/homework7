public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задача 1
        System.out.println("Домашнее задание 3.Задание 1");
        int input = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + input;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //Задача 2
        System.out.println("Домашнее задание 3.Задание 2");
        int input1 = 29000;
        int total1 = 0;
        for (int i = 0; i <= 12; i++){
            total1 = total1 + total1/100;
            total1 = total1 + input1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
    }
}