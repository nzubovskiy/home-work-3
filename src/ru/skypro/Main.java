package ru.skypro;

public class Main<maxMonthlyPayments, monthlyPayments, salary> {

    public static void main(String[] args) {
        // ������ �1
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if (clientOS == 1) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }

        // ������ �2
        int clientDeviceYear = 2013;
        boolean lightVersion = clientDeviceYear < 2015;
        if (clientOS == 0 && lightVersion) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        } else if (clientOS == 0) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        }
        if (clientOS == 1 && lightVersion) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        } else if (clientOS == 1) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        }

        // ������ �3
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " ��� �������� ����������");
        } else if (year % 400 == 0) {
            System.out.println(year + " ��� �������� ����������");
        } else {
            System.out.println(year + " ��� �� �������� ����������");
        }

        // ������ �4
        int deliveryDistance = 95;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("����������� ����: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime = deliveryTime + 1;
            System.out.println("����������� ����: " + deliveryTime);
        } else if (deliveryDistance <= 100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("����������� ����: " + deliveryTime);
        }
        // ������ �5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("����");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("�����");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("����");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("�����");
                break;
            default:
                System.out.println("������ ������ �� ����������");
        }

        // ������� �6
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
        System.out.println("�� ������ ������ ��� ��������� ����� � ������� " + limit + " ������.");


        // ������� �7
        double baseRate = 0.1;
        double rate = 0;
        int loanTerm = 12;
        age = 25;
        salary = 60_000;
        int wantedSum = 330_000;
        int maxMonthlyPayments = (int) (0.5 * salary);
        String result = "� �������� ������������";
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
            result = "��������";
        } else {
            result = "��������";
        }
        System.out.println("������������ ����� ��� �� " + salary + " ����� " + maxMonthlyPayments + " ������. ����� �� �������������� ������� - " + monthlyPayments + " ������. " + result);
    }
}


