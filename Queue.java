/*
 * Author:Danielle DeLooze
 * Student ID: 29493487
 * Project: Lab 7
 * 
 * Used Data Structures and Algorithm Analysis
   Edition 3.2 (Java Version)
   
   and 
   https://www.java2novice.com/data-structures-in-java/linked-list/doubly-linked-list/
   
   for help and reference
 */
public interface Queue<AnyType> {
	public boolean isEmpty();
	public void enqueue(AnyType x);
	public AnyType dequeue();
	public AnyType peek();

}
