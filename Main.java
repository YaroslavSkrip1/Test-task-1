package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        try {
            Integer int1 = Integer.valueOf(str);
            System.out.println(int1);
        } catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
        }
    }
}
