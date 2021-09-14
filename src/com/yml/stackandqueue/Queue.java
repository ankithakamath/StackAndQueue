package com.yml.stackandqueue;

public class Queue {
	
	
private Node head;
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	//to add data to the queue
	public boolean enqueue(int data) {
		boolean isAdded  = false;
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			isAdded  =true;
		}else {
			Node temp = head;
			
			while(temp.next != null) {
				temp = temp.next;
			}
			
			temp.next  = newNode;
			isAdded = true;
		}
		return isAdded;
	}
	//to dequeue the queue
	public int dequeue() {
		if(head == null) {
			System.out.println("The queue is empty");
			return 0;
		}
		Node temp = head;
		head = temp.next;
		return temp.data;
	}
	//to print the queue
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
}


