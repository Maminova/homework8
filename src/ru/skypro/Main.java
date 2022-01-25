package ru.skypro;

import java.sql.Array;
import java.util.Arrays;

public class Main {


    public static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static void printLeapYear(int year) {
        if (isYearLeap(year)) {
            System.out.println("Год является высокосным: " + year);
        } else {
            System.out.println("Год не является высокосным");
        }

    }

    public static void chooseDeviceVersion(int clientDeviceYear, int operatingSystem) {
        if (clientDeviceYear >= 2015 && operatingSystem == 0) {
            System.out.println("Установите  облегченную версию приложения для " + operatingSystem + "по ссылке");
        } else if (clientDeviceYear >= 2015 && operatingSystem == 1) {
            System.out.println("Установите облегченную версию приложения для " + operatingSystem + "по ссылке");
        } else if (clientDeviceYear < 2015 && operatingSystem == 0) {
            System.out.println("Установите  версию приложения для " + operatingSystem + "по ссылке");
        } else {
            System.out.println("Установите  версию приложения для " + operatingSystem + "по ссылке");


        }

    }

    public static void deliveryDistance(int distance) {
        int daysNumber = 1;
        if (distance > 20) {
            daysNumber = daysNumber + 1;
        }
        if (distance >= 60 && distance < 100) {
            daysNumber = daysNumber + 1;
        }
        System.out.println("Потребуется дней " + daysNumber);
    }

    public static char getLowerCaseString(String text) {
        char[] letters = text.toCharArray();
        for (int i = 1; i < letters.length; i++) {
            if (letters[i] == letters[i - 1]) {
                System.out.println("Найден дубль по символу " + letters[i]);
                return letters[i];
            }

        }
        System.out.println("Дубликатов нет");
        return ' ';
    }
    public static void reverseArray(int[]arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex++] = arr[rightIndex];
            arr[rightIndex--] = temp;
        }
    }
        public static void main (String[]args){
            // write your code here
//


            //Задание 1
            printLeapYear(2021);
            printLeapYear(2024);
            // Задание 2
            chooseDeviceVersion(2015, 1);
            // Задание 3
            deliveryDistance(95);
            // Задание 4
            char duplicateChar = getLowerCaseString("abccddefgghiijjkk");
            System.out.println("Найден дубль по символу " + duplicateChar);
            // Задание 5
            int [] arr = new int []{3, 2, 1, 6, 5};
            reverseArray(arr);
            System.out.println("reversed array: " + Arrays.toString(arr));
            System.out.println();

        }
    }


