package ru.skypro;

public class Main {

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
        int year = 2022;
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
        } else if (deliveryDistance <=100) {
            deliveryTime = deliveryTime + 2;
            System.out.println("����������� ����: " + deliveryTime);
        }
        // ������ �5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("����");
                break;
            case 2:
                System.out.println("����");
                break;
            case 3:
                System.out.println("�����");
                break;
            case 4:
                System.out.println("�����");
                break;
            case 5:
                System.out.println("�����");
                break;
            case 6:
                System.out.println("����");
                break;
            case 7:
                System.out.println("����");
                break;
            case 8:
                System.out.println("����");
                break;
            case 9:
                System.out.println("�����");
                break;
            case 10:
                System.out.println("�����");
                break;
            case 11:
                System.out.println("�����");
                break;
            case 12:
                System.out.println("����");
                break;
            default:
                System.out.println("������ ������ �� ����������");
        }


        }

}

