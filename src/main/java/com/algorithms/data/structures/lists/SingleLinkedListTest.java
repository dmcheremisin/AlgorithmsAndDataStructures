package com.algorithms.data.structures.lists;

import com.algorithms.data.structures.lists.singleLinkedList.SingleLinkedList;

public class SingleLinkedListTest {

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        System.out.println(list.isEmpty()); // true

        list.addToFront(new Employee(25, "John", "Snow"));
        list.addToFront(new Employee(38, "Daineris", "Targarien"));
        list.addToFront(new Employee(41, "Tyron", "Lannister"));
        list.add(new Employee(43, "Cersei", "Lannister"));

        System.out.println(list.getSize()); // 4
        System.out.println(list.isEmpty()); // false

        list.printList();
//        HEAD -> Employee{id=41, firstName='Tyron', lastName='Lannister'}
//        NEXT -> Employee{id=38, firstName='Daineris', lastName='Targarien'}
//        NEXT -> Employee{id=25, firstName='John', lastName='Snow'}
//        NEXT -> Employee{id=43, firstName='Cersei', lastName='Lannister'}
//        NEXT -> null

        list.removeFromFront();
        System.out.println(list.getSize()); // 3

        list.printList();
//        HEAD -> Employee{id=38, firstName='Daineris', lastName='Targarien'}
//        NEXT -> Employee{id=25, firstName='John', lastName='Snow'}
//        NEXT -> Employee{id=43, firstName='Cersei', lastName='Lannister'}
//        NEXT -> null
    }
}
