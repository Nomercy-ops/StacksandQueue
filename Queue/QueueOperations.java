/**
 *
 * @author Rikesh Chhetri
 * @version 1.0
 * @Created_on: 07.06.21
 *
 * purpose: is to do Queue operations using linked list.
 *
 */
package com.bridgelabz.datastructure.QueueOperations;

public class QueueOperations<T> {

    private int count;
    private Node<T> front;  //front - contains the first element of the queue.

    private Node<T> rear;  //rear - contains the last element of the queue

    // values of  front and rear are null When the queue is empty.
    public QueueOperations() {
        front = rear = null;
        count = 0;
    }

    /**
     * To add an element to the empty queue creating a new node and then set the
     * front and rear variables to that new node. When adding elements to a
     * queue that is not empty first we have to set the next node pointer of the
     * last element in the queue(i.e, rear.next) to point to the new node and
     * then change the rear variable to contain the new node.
     *
     * @param value
     */
    
    public void enqueue(T value) {
        if (rear != null) {
            rear.next = new Node(value, null);
            rear = rear.next;
        } else {
            rear = new Node(value, null);
            front = rear;
        }
        count++; //keep the count of the elements.
    }

    /**
     * Check if the queue is not empty then get the value of the front
     * node.Change the front node to the next node in the queue (front =front.next)
     * If the next node in the queue is null, then de queued is done on the last element
     *
     * @return value.
     */
    
    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot dequeue - Queue is empty");
        }

        T value = front.value;
        front = front.next;
        count--; // if deleted it will also update the count.

        if (front == null) {
            rear = null; //  setting rear to null.
        }
        return value;
    }

    /**
     * Used for checking  if the queue is empty or not.
     * @return  True or False
     */
    public boolean isEmpty() {
        return front == null;
    }

    /**
     * It is used get or display the first element of queue without removing it.
     * @return front value of  queue.
     */
    public T peek() {
        if (isEmpty()) {
            System.out.println(" Queue is empty");
        }
        return front.value;
    }
    
    /**
     * It is used to get the size or number of elements present in the queue.
     * @return size
     */

    public int size() {
         if (isEmpty()) {
         System.out.println("Queue is empty");
        }
        return count;
    }

}
