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
        //Задача 4
        System.out.println("Домашнее задание 2.Задание 1");
        int totalDeposit = 15000;
        int month = 0;
        while (totalDeposit <= 12_000_000) {
            month++;
            totalDeposit = (int) (totalDeposit + totalDeposit * 0.07);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalDeposit + " рублей");
        }
        //Задача 5
        System.out.println("Домашнее задание 2.Задание 2");
        int totalDeposit1 = 15_000;
        int month1 = 0;
        while (totalDeposit1 <= 12_000_000) {
            month1++;
            totalDeposit1 = (int) (totalDeposit1 + totalDeposit1 * 0.07);
            if (month1 % 6 == 0) {
                System.out.println("Месяц " + month1 + ", сумма накоплений равна " + totalDeposit1 + " рублей");
            }
        }
        //Задача 6
        System.out.println("Домашнее задание 2.Задание 3");
        int totalDeposit2 = 15000;
        int periodYears = 9;
        for (int periodMonths = 1; periodMonths <= periodYears * 12; periodMonths++) {
            totalDeposit2 = (int) (totalDeposit2 + totalDeposit2 * 0.07);
            if (periodMonths % 6 == 0) {
                System.out.println("Месяц " + periodMonths + ", сумма накоплений равна " + totalDeposit2 + " рублей");
            }
        }
        //Задача 7
        System.out.println("Домашнее задание 2.Задание 4");
        for (int friday = 1; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }

    }
}