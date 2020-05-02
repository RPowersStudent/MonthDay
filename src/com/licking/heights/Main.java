package com.licking.heights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayOfWeek;
        int dayOfMonth;
        int month;
        int year;
        int yearOfCentury;
        int yearZeroBased;
        Scanner Keyboard;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go,");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,\n" +
                "is fair and wise and good in every way.");

        System.out.println("What month were you born? (Enter the number please)");
        month = keyboard.nextInt();
        System.out.println("What day were you born? (Enter the number please)");
        dayOfMonth = keyboard.nextInt();
        System.out.println("What year were you born?");
        year = keyboard.nextInt();

        int monthAnswer = amountOfDaysInMonth(month, year);
        System.out.println("There are " + monthAnswer + " days in this month");
    }
    public static int amountOfDaysInMonth(int month, int year) {
        switch (month) {
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
            case 13:
                return 31;

            case 4:
            case 6:
            case 9:
            case 11:
                return 30;

            default:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
        }
    }
    public static int zellersCongruence(int month, int year, int dayOfMonth) {
            if (month == 1 || month == 2) {
                month = (month + 12);
                year--;
            }

            int yearZero = (year / 100);
            int zellerCongruenceEquation = 13 * (month + 1);
            int yearCentury = (year % 100);
            int dayOfWeek = ((dayOfMonth + (zellerCongruenceEquation/5)+ yearCentury +(yearCentury/4)+(yearZero/4)+(5*(yearZero)))%7);
            return dayOfWeek;
        }
    }


