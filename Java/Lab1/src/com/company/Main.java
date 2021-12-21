//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Task One");
            new com.company.TaskOne(input);
            System.out.println("\nTask Two");
            new com.company.TaskTwo(input);
            input.close();
        } catch (Exception var4) {
            System.out.println("\n" + var4.getMessage());
        }

    }
}