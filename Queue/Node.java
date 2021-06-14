package com.bridgelabz.datastructure.QueueOperations;

public class Node<T> {

    T value;
    Node<T> next;

    /**
     * it will store the value and make next = null
     *
     * @param data
     */
    Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

}
