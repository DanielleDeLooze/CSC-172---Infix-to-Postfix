/*
 * Author: Danielle DeLooze
 * Student ID: 29493487
 * Email: ddelooze@u.rochester.edu
 * Date: 3/5/2016
 * Project: Project 2
 */
public class InfixtoPostfix {
	
	protected LQueue<String> queue;
	protected LStack<String> stack;
	protected StringBuilder infix;
	protected String[] values; 
	
	InfixtoPostfix(){
		queue = new LQueue<String>();
		stack = new LStack<String>();
	}
	
	public LQueue<String> postFix(String exp){ //expression to change infix to postfix
		
		String delim = "[ ]";
		values = exp.split(delim);
				
		
		
		for(int i = 0; i < values.length ; i++){ //will cycle through all positions in the string
			if( values[i].equals("(")){ //if char is '(', then it will be pushed onto stack
				stack.push(values[i]);
			}
			else if (values[i].equals(")")){ // if char is ')', then it will pop until the closing parenthesis is found
				while(!(stack.peek().equals("("))){  //while the top data values is not a closing parenthesis 
					queue.enqueue(stack.pop()); //pop and enqueue values
				}
				stack.pop(); // get rid of closing parenthesis in stack
			}
			else if(values[i].equals("+") || values[i].equals("-")){ // if the char is a '+' or '-'
				if(!(stack.isEmpty())){ //if the stack is empty it won't proceed
					while(stack.peek().equals("*") || stack.peek().equals("/") || stack.peek().equals("^") || stack.peek().equals("+") || stack.peek().equals("-")){ //pop and queue any operator of equal or higher precedence
						queue.enqueue(stack.pop());
						if (stack.isEmpty()){
							break;
						}
					}
				}
				stack.push(values[i]); // push the char at i
			}
			else if(values[i].equals("*") || values[i].equals("/")){ // if the char is a '*' or '/'
				if(!(stack.isEmpty())){
					while(stack.peek().equals("*") || stack.peek().equals("/") || stack.peek().equals("^")){ //pop and queue any operators of equal or higher presedence
						queue.enqueue(stack.pop());
						if(stack.isEmpty()){
							break;
						}
					}
				}
				stack.push(values[i]); //push char
			}
			else if(values[i].equals("^")){
				if(!(stack.isEmpty())){
					while(stack.peek().equals("^")){ //pop and queue any equal precedence operators
						queue.enqueue(stack.pop());
						if(stack.isEmpty()){
							break;
						}
					}
				}
				stack.push(values[i]);//push char
			}
			else if (values[i].equals("<") || values[i].equals(">") || values[i].equals("!") || values[i].equals("=") || values[i].equals("|") || values[i].equals("&")){
				if(!(stack.isEmpty())){
					while( !(stack.peek().equals("("))){
						queue.enqueue(stack.pop());
						if(stack.isEmpty()){
							break;
						}
					}
				}
				stack.push(values[i]);
				
			}
			else{ //if the char at i is a operand, enqueue
				queue.enqueue(values[i]);
			}
			
		}//end for loop
		
		while(!(stack.isEmpty())){ //while the stack is not empty, enqueue the remaining operators
			queue.enqueue(stack.pop()); 
		}
		
		return queue;
		
		
		
		
		
	} //end method

}//end class
