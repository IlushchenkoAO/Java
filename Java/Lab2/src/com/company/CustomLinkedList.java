//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.io.Serializable;

public class CustomLinkedList<T> implements IList<T>, Serializable {
    private Node head;

    public CustomLinkedList() {
    }

    public void add(T data) throws Exception {
        if (data == null) {
            throw new Exception("You cannot add empty data");
        } else {
            Node newNode = new Node(data);
            if (this.head == null) {
                this.head = newNode;
            } else {
                Node n;
                for(n = this.head; n.next != null; n = n.next) {
                }

                n.next = newNode;
            }

        }
    }

    public void remove(int index) {
        if (index >= 0 && index < this.size()) {
            if (index == 0) {
                this.head = this.head.next;
            } else {
                Node currentNode = this.head;

                for(int i = 0; i < index - 1; ++i) {
                    currentNode = currentNode.next;
                }

                currentNode.next = currentNode.next.next;
            }

        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
    }

    public boolean contains(T data) throws Exception {
        if (data == null) {
            throw new Exception("We cannot fund empty data");
        } else {
            for(Node n = this.head; n.next != null; n = n.next) {
                if (n.data == data) {
                    return true;
                }
            }

            return false;
        }
    }

    public int size() {
        int count = 0;
        Node n = this.head;
        if (n == null) {
            return 0;
        } else {
            while(n.next != null) {
                ++count;
                n = n.next;
            }

            return count + 1;
        }
    }

    public void showList() throws Exception {
        Node currentNode = this.head;
        if (currentNode == null) {
            throw new Exception("Linked list is empty");
        } else {
            while(currentNode != null) {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            }

        }
    }
}
