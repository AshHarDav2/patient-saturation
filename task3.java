package com.company;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 10 && number < 100)
            System.out.println("number is in range of 10 to 100");
        else if (number > 200 && number < 300)
            System.out.println("number is in range of 200 to 300");
        else if (number > 300 && number < 500)
            System.out.println("number is in range of 300 to 500");
        else
            System.out.println("no such range");
    }
}
