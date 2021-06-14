package com.bridgelabz.datastructure.QueueOperations;

/**
 *
 * This is the main method for doing Queue operations.
 */
public class Runner {

    public static void main(String[] args) {
        // create Object of Implementing class
        QueueOperations queueoperation = new QueueOperations();
        queueoperation.enqueue(56);
        queueoperation.enqueue(30);
        queueoperation.enqueue(70);
        System.out.println("The Size Of the Queue is : " + queueoperation.size());
        System.out.println("The Front Value Of Queue is : " + queueoperation.peek());
        queueoperation.dequeue();
        System.out.println("The Size Of the Queue is : " + queueoperation.size());
        System.out.println("The Front Value Of Queue is : " + queueoperation.peek());
        queueoperation.dequeue();
        System.out.println("The Size Of the Queue is : " + queueoperation.size());
        System.out.println("The Front Value Of Queue is : " + queueoperation.peek());
        queueoperation.dequeue();
        System.out.println("The Size Of the Queue is : " + queueoperation.size());

    }
}
