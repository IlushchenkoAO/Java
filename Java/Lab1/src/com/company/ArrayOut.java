//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class ArrayOut {
    public ArrayOut() {
    }

    public static void OutArray(int[] arr) {
        int[] var1 = arr;
        int var2 = arr.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            int item = var1[var3];
            System.out.print(item + " ");
        }

        System.out.println();
    }
}
