//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.io.Serializable;
import java.util.Arrays;

class CustomArrayList<T> implements IList<T>, Serializable {
    private static final int initialCapacity = 10;
    private int size = 0;
    private Object[] elementData = new Object[0];

    public CustomArrayList() {
        this.elementData = new Object[10];
    }

    public void add(T data) throws Exception {
        if (data == null) {
            throw new Exception("You cannot add empty data");
        } else {
            if (this.size == this.elementData.length) {
                this.ensureCapacity();
            }

            this.elementData[this.size++] = data;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < this.size) {
            for(int i = index; i < this.size - 1; ++i) {
                this.elementData[i] = this.elementData[i + 1];
            }

            --this.size;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
    }

    public boolean contains(T data) throws Exception {
        if (data == null) {
            throw new Exception("We cannot fund empty data");
        } else {
            for(int i = 0; i < this.size - 1; ++i) {
                if (this.elementData[i] == data) {
                    return true;
                }
            }

            return false;
        }
    }

    public int size() {
        return this.size;
    }

    public void showList() throws Exception {
        if (this.size == 0) {
            throw new Exception("Linked list is empty");
        } else {
            for(int i = 0; i < this.size; ++i) {
                Object var10001 = this.elementData[i];
                System.out.print(var10001 + " ");
            }

        }
    }

    private void ensureCapacity() {
        int newIncreasedCapacity = this.elementData.length * 2;
        this.elementData = Arrays.copyOf(this.elementData, newIncreasedCapacity);
    }
}
