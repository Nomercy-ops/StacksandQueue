package com.bridgelabz.datastructure.StackandQueue;

/**
 * 
 * This is the main method for doing stack operations.
 */
public class Runner {

    public static void main(String[] args) {
        // create Object of Implementing class
        StackOperations stackoperation = new StackOperations();

        stackoperation.push(56);
        stackoperation.push(30);
        stackoperation.push(70);
        stackoperation.display();
        System.out.println(stackoperation.peek() + "peek");
        stackoperation.pop();
        System.out.println(stackoperation.peek() + "peek");
        stackoperation.pop();
        System.out.println(stackoperation.peek() + "peek");
        stackoperation.pop();
        stackoperation.pop();
        stackoperation.display();

    }
}
