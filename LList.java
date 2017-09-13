/*
 * Author: Danielle DeLooze
 * Student ID: 29493487
 * Date: 2/19/2017
 * Project: Lab 6
 * 
 * Used Data Structures and Algorithm Analysis
   Edition 3.2 (Java Version)
   
   for reference and help
 */
public class LList<AnyType>{
	protected Node<AnyType> head;
	private Node<AnyType> tail;
	protected Node<AnyType> curr;
	private Node<AnyType> temp;
	int count;
	
	LList(){
		curr = tail = head = new Node<AnyType>(null);
		count = 0;
	}
	
	public void clear(){
		head.setNext(null);
		curr = tail = head = new Node<AnyType>(null);
		count = 0;
	}
	
	public void insert(AnyType it){
		curr.setNext(new Node<AnyType>(it,curr.next()));
		if (tail == curr){
			tail = curr.next();
		}
		count++;
	}
	
	public AnyType remove(){
		if (curr.next()==null){
			return null;
		}
		AnyType it = curr.next().data();
		if (tail == curr.next()){
			tail = curr;
		}
		curr.setNext(curr.next().next());
		count--;
		return it;
	}
	
	public boolean isEmpty(){
		return (head == null);
	}
	
	public void printList(){
		temp = head;
		while (temp != null){
			if (temp.data() != null){
			System.out.println(temp.data());
			}
			temp = temp.next();
			
		}
	}
	
	public void delete(AnyType it){
		temp = head;
		while(temp.next().data() != it){
			temp = temp.next();
		}
		temp.setNext(temp.next().next());
		
	}
	
	public boolean contains(AnyType it){
		temp = head;
		while(temp!=null){
			if(temp.data() == it){
				return true;
			}
			temp = temp.next();
			
		}
		return false;
	}
	
	public AnyType lookUp(AnyType it){
		curr = head;
		for(int i = 0; i<count;i++){
			if(curr.data() == it){
				return curr.data();
			}
			curr = curr.next();
		}
		return null;
	}
	
	public void removeTop(){
		head = head.next().next();
		
	}
	
	
}
