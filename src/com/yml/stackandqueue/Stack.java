package com.yml.stackandqueue;

public class Stack {
	
	private Node head;
	
	private class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	//pushing values to stack
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	
	//printing the stack
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
		public int pop() {
			if(head == null) {
				System.out.println("The stack has no elements");
				return 0;
			}
			Node temp = head;
			head = temp.next;
			return temp.data;
		}
		
		
		
		public int peak() {
			if(head == null) {
				System.out.println("The stack has no elements");
				return 0;
			}
			Node temp = head;
			return temp.data;
		}
	}



