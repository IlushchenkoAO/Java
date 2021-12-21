//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println(Kata.findUniq(new double[]{1.0D, 1.0D, 1.0D, 2.0D, 1.0D, 1.0D}));
        System.out.println(Kata.findUniq(new double[]{0.0D, 0.0D, 0.55D, 0.0D, 0.0D}));
        int[] var1 = Sort.sortOddsOnly(new int[]{5, 3, 2, 8, 1, 4});
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int number = var1[var3];
            System.out.print(number + " ");
        }

    }
}
