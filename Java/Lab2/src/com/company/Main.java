//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Enter 1 if you want use LinkedList or 2 if you want use ArrayList");
        System.out.print("Enter: ");
        Scanner input = new Scanner(System.in);
        Object list;
        if (input.hasNextInt() && input.nextInt() == 1) {
            list = new CustomLinkedList();
        } else {
            list = new CustomArrayList();
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("list.txt"));

            try {
                oos.writeObject(list);
                ((IList)list).add(1);
                ((IList)list).add(2);
                ((IList)list).add(3);
                ((IList)list).add(4);
                ((IList)list).remove(2);
                System.out.println("Is list contains 2: " + ((IList)list).contains(2));
                System.out.println("Is list contains 12: " + ((IList)list).contains(12));
                System.out.println("Size is " + ((IList)list).size());
                System.out.println("List:");
                ((IList)list).showList();
            } catch (Throwable var7) {
                try {
                    oos.close();
                } catch (Throwable var6) {
                    var7.addSuppressed(var6);
                }

                throw var7;
            }

            oos.close();
        } catch (Exception var8) {
            System.out.println(var8.getMessage());
        }

    }
}
