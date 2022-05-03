package ru.skypro;

public class Main<maxMonthlyPayments, monthlyPayments, salary> {

    public static void main(String[] args) {
        // Задача №1
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача №2
        int clientDeviceYear = 2013;
        boolean lightVersion = clientDeviceYear < 2015;
        if (clientOS == 0 && lightVersion) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && lightVersion) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача №3
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача №4
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
        // Задача №5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }

        // Задание №6
        int age = 19;
        int salary = 58_000;
        int limit = 2 * salary;
        if (age >= 23) {
            limit = 3 * salary;
        }
        if (salary >= 80_000) {
            limit = (int) (1.5 * limit);
        } else if (salary >= 50_000) {
            limit = (int) (1.2 * limit);
        }
        System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");


        // Задание №7
        double baseRate = 0.1;
        double rate = 0;
        int loanTerm = 12;
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;
        int maxMonthlyPayments = (int) (0.5 * salary);
        String result = "В процессе рассмотрения";
        if (age < 23) {
            rate = baseRate + 1 / 100;
        } else if (age < 30) {
            rate = baseRate + 0.5 / 100;
        }
        if (salary > 80_000) {
            rate = rate - 0.7 / 100;
        }
        System.out.println(baseRate);
        System.out.println(rate);
        System.out.println(maxMonthlyPayments);
        double monthlyPayments = (int) (wantedSum * ((rate / 12 * Math.pow(1 + rate / 12, loanTerm)) / (Math.pow(1 + rate / 12, loanTerm) - 1)));
        System.out.println(monthlyPayments);

        if (maxMonthlyPayments >= monthlyPayments) {
            result = "Одобрено";
        } else {
            result = "Отказано";
        }
        System.out.println("Максимальный платёж при ЗП " + salary + " равен " + maxMonthlyPayments + " рублей. Платёж по запрашиваемому кредиту - " + monthlyPayments + " рублей. " + result);
    }
}


