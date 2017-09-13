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
public class DNode<AnyType> {
	private AnyType data;
	private DNode<AnyType> next;
	private DNode<AnyType> prev;
	
	DNode(AnyType it, DNode<AnyType> n, DNode<AnyType> p){
		data = it;
		next = n;
		prev = p;
	}
	
	DNode(DNode<AnyType> n, DNode<AnyType> p){
		next = n;
		prev = p;
	}
	
	DNode<AnyType> next(){
		return next;
	}
	
	DNode<AnyType> setNext(DNode<AnyType> nextVal){
		return (next = nextVal);
	}
	
	DNode<AnyType> prev(){
		return prev;
	}
	
	DNode<AnyType> setPrev(DNode<AnyType> prevVal){
		return (prev = prevVal);
	}
	
	AnyType data(){
		return data;
	}
	
	AnyType setData(AnyType it){
		return (data = it);
	}
}
