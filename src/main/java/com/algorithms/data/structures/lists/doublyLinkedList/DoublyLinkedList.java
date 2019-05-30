package com.algorithms.data.structures.lists.doublyLinkedList;

import com.algorithms.data.structures.model.Employee;

public class DoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if(head == null){
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public void add(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);

        if(tail == null){
            head = node;
        } else {
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public Employee removeFromFront() {
        if(isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = head;

        if(head.getNext() == null){
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        removedNode.setNext(null);

        size--;
        return removedNode.getEmployee();
    }

    public Employee remove() {
        if(isEmpty()) {
            return null;
        }

        EmployeeNode removedNode = tail;

        if(tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }

        tail = tail.getPrevious();
        removedNode.setPrevious(null);

        size--;

        return removedNode.getEmployee();
    }

    public void printList() {
        EmployeeNode next = head;
        System.out.print("HEAD -> ");
        while(next != null) {
            System.out.println(next);
            System.out.print("NEXT <=> ");
            next = next.getNext();
        }
        System.out.println("null");

    }
}
