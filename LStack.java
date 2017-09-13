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
public class LStack<AnyType> implements Stack<AnyType> {
	 protected LList<AnyType> list;
	 protected int size;
	 
	 public LStack(){
		list = new LList<AnyType>();
		size = 0;
	 }
	 
	 public void push(AnyType x){
		 list.head = new Node<AnyType>(x, list.head);
		 size++;
	 }
	 
	 public AnyType peek(){
		 if(this.isEmpty()){
			 return null;
		 }
		 return list.head.data();
	 }
	 
	 public boolean isEmpty(){
		 return ( size == 0);
	 }
	 
	 public AnyType pop(){
		 if (this.isEmpty()){
			 return null;
		 }
		 AnyType it = list.head.data();
		 list.head = list.head.next();
		 size--;
		 return it;
	 }
	
}
