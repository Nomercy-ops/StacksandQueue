/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 07.06.21
 *
 * purpose: is to do the stack operations using linked list.
 * 
 *
 */

package com.bridgelabz.datastructure.StackandQueue;

public class StackOperations {

    MyNode top;
    // Constructor

    StackOperations() {
        this.top = null;
    }

    /**
     *  Method for inserting elements into the stack.
     * This method will push the element into the stack.
     * @param x 
     */
    
    public void push(int x) 
    {
        
        MyNode temp = new MyNode();
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.data = x;
        temp.link = top;
        top = temp;
    }

   /**
    * Method for checking if an stack is empty or not and return true or false.
    * @return 
    */
    
    public boolean isEmpty() {
        return top == null;
    }
    
/**
 * This method is used to return top element from the stack. 
 * @return 
 */
    
    public int peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

  /**
   *  This method is used to pop out the top of the element from the stack.
   */
    
    public void pop() 
    {
       // check for stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).link;
    }
    
    /**
     * 
     */

    public void display() {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            
        } else {
            MyNode temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.data);
                temp = temp.link;
            }
        }
    }
}

