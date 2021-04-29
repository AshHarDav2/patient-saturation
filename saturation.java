package com.company;

import java.util.Scanner;

public class saturation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = 4;
        int button = scanner.nextInt();
        if (button == 1){
            double perimeter = 2* Math.PI * radius;
            System.out.println(perimeter);
        }
        else if (button == 2){
            double area = Math.PI * radius * radius;
            System.out.println(area);
        }



    }
}
