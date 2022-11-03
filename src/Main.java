public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 2, домашнее задание 1, задание 1 ");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            i++;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        ///"Задание 2, домашнее задание 1, задание 3 "
        System.out.println("Задание 2, домашнее задание 1, задание 2 ");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.println(a);
        }
        for (int b = 10; b > 0; b--) {
            System.out.println(b);
        }
        ///"Задание 2, домашнее задание 1, задание 3 "
        System.out.println("Задание 2, домашнее задание 1, задание 3 ");
        int countryPopulation = 12_000_000;
        int countryBirth = 17;
        int countryDeath = 8;
        for (i = 1; i <= 10; i++) {
            countryPopulation = countryPopulation + countryBirth * 12000 - countryDeath * 12000;
            System.out.println("Год " + i + ", численность населения составляет " + countryPopulation);
        }
        ///"Задание 2, домашнее задание 2, задание 1,2 "
        System.out.println("Задание 4, домашнее задание 2, задание 1,2 ");
        int vasiliyMoney = 15000;
        int totalVasiliy = 0;
        int c = 0;
        while (totalVasiliy < 12000000) {
                totalVasiliy = totalVasiliy + totalVasiliy / 7;
                totalVasiliy = totalVasiliy + vasiliyMoney;
                c++;
                if (c % 6 == 0) {
                    System.out.println("Месяц " + c + " сумма накоплений " + totalVasiliy);
                }
            }
        ///"Задание 2, домашнее задание 2, задание 3 "
        System.out.println("Задание 4, домашнее задание 2, задание 3 ");
        int vasiliyMoneySecond = 15000;
        int totalVasiliySecond = 0;
        for (int d = 1; d <= 108; d++) {
            totalVasiliySecond = totalVasiliySecond + totalVasiliySecond / 7;
            totalVasiliySecond = totalVasiliySecond + vasiliyMoneySecond;
            if (d % 6 == 0) {
                System.out.println("Месяц " + d + " сумма накоплений " + totalVasiliySecond);
            }
        }
        ///"Задание 2, домашнее задание 2, задание 4 "
        System.out.println("Задание 4, домашнее задание 2, задание 4 ");
        int day  = 0;
        int friday = 4;
        while (day < 31){
            day ++;
            if (day % 7 == friday)
                System.out.println("Сегодня пятница," + day +" -е число. Необходимо подготовить отчет.");
        }

   }
}