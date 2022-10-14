package org.example;

/**
 * a) Intersection: Given two (singly) linked lists, determine if the two lists intersect.
 * Return the intersecting node.
 * Note that the intersection is defined based on reference, not value.
 * That is, if the kth node of the first linked list is the exact same node (by reference)
 * as the jth node of the second linked list, then they are intersecting.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(25);
        ll.append(50);
        ll.append(75);
        ll.append(100);
    }
}

class Node {
    Node next;
    int data;
    public Node (int data){
        this.data = data;
    }
}

class LinkedList {
    Node head;

    void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

}

