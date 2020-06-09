package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 1;
        if (n == 1)
            System.out.println(0);
        else if (n == 2)
            System.out.println(1);
        else {
            for (int i = 3; i <= n; i++) {
                b = b + a;
                a = b - a;
            }
            System.out.println(b);

        }

    }
}
