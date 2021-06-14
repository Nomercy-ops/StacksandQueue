package com.bridgelabz.datastructure.StackandQueue;

/**
 * 
 * Creating a linked list node .
 * Link is a reference variable Node type
 */

  public class Node<T> {

	public Node<T> next;
	public T data;

	/**
	 *  it will store the data and make next = null
	 * @param   : data
	 */
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
}


