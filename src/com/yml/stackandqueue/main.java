package com.yml.stackandqueue;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Stack and Queue Practice");


Queue queue = new Queue();
//Ability to create a queue of 56,30 and 70
queue.enqueue(56);
queue.enqueue(30);
queue.enqueue(70);
queue.print();
System.out.println(" ");
queue.dequeue();
queue.dequeue();
queue.dequeue();
queue.dequeue();
queue.print();
	}

}
