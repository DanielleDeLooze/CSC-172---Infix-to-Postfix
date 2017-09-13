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
public class DLList<AnyType> {
	protected DNode<AnyType> head;
	protected DNode<AnyType> tail;
	protected DNode<AnyType> curr;
	private DNode<AnyType> temp;
	int count;
	
	DLList(){
		count = 0;
		
	}
	
	public boolean isEmpty(){
		return (count == 0);
	}
	
	public void insert(AnyType it, DNode<AnyType> node){
		DNode<AnyType> newNode = new DNode<AnyType>(null,null);
		newNode.setData(it);
		newNode.setPrev(node);
		newNode.setNext(node.next());
		(newNode.prev()).setNext(newNode);
		(newNode.next()).setPrev(newNode);
		count++;
	}
	
	public void insert(AnyType it){
		curr.setNext(new DNode<AnyType>(it, curr, curr.next()));
		curr.next().next().setPrev(curr.next());
		count++;
		
	}
	
	public void printList(){
		temp = head;
		while(temp != null){
			System.out.println(temp.data());
			temp = temp.next();
		}
	}
	
	
	
	public void addFirst(AnyType it){
		 temp = new DNode<AnyType>(it, head, null);
	     if(head != null ) {
	    	 head.setPrev(temp);
	     }
	     head = temp;
	     if(tail == null) {
	    	 tail = temp;
	     }
	     count++;
	      
	}
	
	public void addLast(AnyType it){
		temp = new DNode<AnyType>(it, null, tail);
        if(tail != null) {
        	tail.setNext(temp);
        }
        tail = temp;
        if(head == null) { 
        	head = temp;
        }
        count++;
       
	}
	
	public void printListRev(){
		temp = tail;
		while(temp != null){
			System.out.println(temp.data());
			temp = temp.prev();
		}
	}
	
	public AnyType removeFirst(){
		temp = head;
		head = head.next();
		if (head != null){
			head.setPrev(null);
		}
		count--;
		return temp.data();
	}
	
	public AnyType removeLast(){
		temp = tail;
		tail = tail.prev();
		tail.setNext(null);
		count--;
		return temp.data();
	}
	
}
