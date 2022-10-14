package org.example;

import java.util.HashSet;
import java.util.Set;

/**
 * a) Intersection: Given two (singly) linked lists, determine if the two lists intersect.
 * Return the intersecting node.
 * Note that the intersection is defined based on reference, not value.
 * That is, if the kth node of the first linked list is the exact same node (by reference)
 * as the jth node of the second linked list, then they are intersecting.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.append(25);
        l1.append(50);
        l1.append(75);
        l1.append(100);

        LinkedList l2 = l1;

//        ll.printList();
        Set<Node> nodeSet = l1.returnNodeSet();
//        nodeSet.forEach(System.out::println);
        Node intersectingNode = returnIntersectingNode(l1, l2);
        System.out.println(intersectingNode);
    }

    public static Node returnIntersectingNode(LinkedList l1, LinkedList l2) {
        Set<Node> nodeSetL1 = l1.returnNodeSet();
        Set<Node> nodeSetL2 = l2.returnNodeSet();

        // Return the first node that fond in both sets of nodes
        for (Node n : nodeSetL1) {
            if (nodeSetL2.contains(n)) {
                return n;
            }
        }
        return null;
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
    void printList()
    {
        Node currentNode = this.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList
        while (currentNode != null) {
            // Print the data at current node
            System.out.print(currentNode.data + " ");

            // Go to next node
            currentNode = currentNode.next;
        }
    }

    Set<Node> returnNodeSet() {
        Set<Node> nodeSet = new HashSet<>();
        Node currentNode = this.head;

        while (currentNode != null) {
            nodeSet.add(currentNode);
            currentNode = currentNode.next;
        }
        return nodeSet;
    }

}

