//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class Sort {
    public Sort() {
    }

    public static int[] sortOddsOnly(int[] array) {
        for(int i = 0; i < array.length; ++i) {
            if (array[i] % 2 != 0) {
                for(int j = i + 1; j < array.length; ++j) {
                    if (array[j] % 2 != 0 && array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

        return array;
    }
}
