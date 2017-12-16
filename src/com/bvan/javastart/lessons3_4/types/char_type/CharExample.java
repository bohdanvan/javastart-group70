package com.bvan.javastart.lessons3_4.types.char_type;

/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        System.out.println("I ❤ Java \uD83D\uDE42");
        System.out.println("\uD83D\uDE28\uD83D\uDE27\uD83D\uDE26\uD83D\uDE31\uD83D\uDE2B\uD83D\uDE29");
        System.out.println("☺");

        char c1 = 'a';
        char c2 = '\\';
        char c3 = '\u2764';
        char c4 = 1002;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        // "D:\\"
        System.out.println("\"D:\\\\\"");

        System.out.println("Курс доллара в обменниках украинских банков\n" +
                "https://finance.i.ua/usd/\n" +
                "Translate this page\n" +
                "Created with Highstock 2.1.10 Zoom неделя месяц 3 месяца 6 месяцев год 10 лет 16. Нояб 20. Нояб 24. Нояб 28. Нояб 2. Дек 6. Дек 10. Дек 14. Дек 2008 2012 2016 26 26.5 27 27.5 28 28.5. показать график. Курс валют банков в Украине. USD · EUR · RUB. Банк. Покупка. Продажа. Средний, 27.5786, 27.9986.\n" +
                "Курс доллара в банках Киева - Минфин\n" +
                "https://minfin.com.ua/currency/banks/kiev/usd/\n" +
                "Translate this page\n" +
                "Узнайте лучший курс доллара в банках Киева на сегодня, архив и графики курсов валют в банках Киева на сайте Minfin.com.ua.\n" +
                "Курс валют Україна – Курси валют на сьогодні: готівкові, офіційні ...\n" +
                "https://finance.ua/ua/currency\n" +
                "Translate this page\n" +
                "Зведена інформація по курсах валют в Україні: курс основних валют за даними НБУ, готівкового ринку, банківські курси валют, карткові, міжбанк та курси Forex Україна на Finance.ua.\n");

    }
}
