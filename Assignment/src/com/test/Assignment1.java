package com.test;

import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        final Scanner sc = new Scanner(System.in);
        System.out.println("enter no .of subjects");
        int subjects = sc.nextInt();
        boolean isFailed = false;
        int marks[] = new int[subjects];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter " + (i + 1) + " marks");
            marks[i] = sc.nextInt();
        }
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 30) {
                isFailed = true;
                break;
            }
            total = total + marks[i];
        }

        if (isFailed) {
            System.out.println("Student Failed");
        } else {
            System.out.println("Total Marks of Student :" + total);
            double percentage = total / subjects;
            System.out.println("Student Percentage :" + percentage);

            if (percentage > 65) {
                System.out.println("1st class");
            } else if (percentage > 45) {
                System.out.println("2nd class");
            } else {
                System.out.println("3rd class");
            }

        }
    }

}

