public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 2, домашнее задание 1, задание 1 ");
        int salary = 15000;
        int total = 0;
        int i = 1;
            while (total < 2_459_000) {
                total = total + total / 100;
                total = total + salary;
                i ++;
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
            ///"Задание 2, домашнее задание 1, задание 3 "
        System.out.println("Задание 2, домашнее задание 1, задание 2 ");
            int a = 0;
            while (a < 10) {
                a ++;
                System.out.println(a);
            }
            for (int b = 10; b >0 ; b --){
                System.out.println(b);
            }
        ///"Задание 2, домашнее задание 1, задание 3 "
        System.out.println("Задание 2, домашнее задание 1, задание 3 ");
             int countryPopulation = 12_000_000;
             int countryBirth = 17;
             int countryDeath = 8;
             for(i = 1; i <= 10; i ++) {
                 countryPopulation = countryPopulation + countryBirth * 12000 - countryDeath * 12000;
                 System.out.println("Год " + i + ", численность населения составляет " + countryPopulation);

             }
        }
    }
