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
public class LQueue<AnyType> implements Queue<AnyType>{
	protected DLList<AnyType> list;
	protected int count;
	
	public LQueue(){
		list = new DLList<AnyType>();
		count = 0;
		
	}
	
	public boolean isEmpty(){
		return(list.count == 0);
	}
	
	public void enqueue(AnyType it){
		list.addLast(it);
		count++;
		
	}
	
	public AnyType dequeue(){
		if(list.isEmpty()){
			return null;
		}
		count--;
		
		return list.removeFirst();
		
	}
	
	public AnyType peek(){
		return list.head.data();
	}
}
