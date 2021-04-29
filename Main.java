package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int saturation = scanner.nextInt();
        if (saturation == 0){
            System.out.println("your pacient is unavailable or dead");
        }
        else if (saturation == 30){
            System.out.println("situation is awfully bad");
        }
        else if (saturation == 50){
            System.out.println("will live");
        }
        else  if (saturation == 70){
            System.out.println("not bad");
        }
        else if (saturation == 98){
            System.out.println("you are a lucky man very good");
        }
        else{
            System.out.println("no such case");
        }
    }
}
