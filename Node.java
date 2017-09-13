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
public class Node<AnyType> {
	private AnyType data;
	private Node<AnyType> next;
	
	Node(AnyType it, Node<AnyType> nextVal){
		data = it;
		next = nextVal;
	}
	
	Node(Node<AnyType> nextVal){
		next = nextVal;
	}
	
	Node<AnyType> next(){
		return next;
	}
	
	Node<AnyType> setNext(Node<AnyType> nextVal){
		return next=nextVal;
	}
	
	AnyType data(){
		return data;
	}
	
	AnyType setData(AnyType it){
		return data = it;
	}
}
