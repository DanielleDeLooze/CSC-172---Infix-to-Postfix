

public class PostFixEval {
	protected LQueue<String> queue;
	protected LStack<Double> stack;
	
	PostFixEval(LQueue<String> postfix){
		queue = postfix;
		stack = new LStack<Double>();
	}
	
	public double postfixEval(){
		int temp = queue.count; //total number of data values in the queue
		for(int i = 0; i < temp; i++){ //runs through all the values in the queue
			if(queue.peek().equals("+")){ // if the next value is a +, it will pop the first two values in the stack and add them together
				queue.dequeue();
			 	double second = stack.pop();
				double first = stack.pop();
				stack.push((first + second));
			}
			else if(queue.peek().equals("-")){ //if the next value is a - , it will pop the first two values and subtract the first valued popped from the second value popped
				queue.dequeue();
				double second = stack.pop();
				double first = stack.pop();
				stack.push(first - second);
			}
			else if(queue.peek().equals("*")){ // if the next value is a *, it will pop the first two values and multiply them together
				queue.dequeue();
				double second = stack.pop();
				double first = stack.pop();
				stack.push(first * second);
			}
			else if(queue.peek().equals("/")){//if the next value is a /, it will pop the first two values and divide the second value popped by the first value popped
				queue.dequeue();
				double second = stack.pop();
				double first = stack.pop();
				stack.push(first/second);
			}
			else if(queue.peek().equals("^")){ //if the next value is a ^, it will pop the first two values and raise the second value popped by the first value popped
				queue.dequeue();
				double second = stack.pop();
				double first = stack.pop();
				stack.push(Math.pow(first, second));
			}
			else if(queue.peek().equals("<")){//if the next value is a <, it will return a 1.0 if the second value popped is less than the first value popped
				queue.dequeue();
				double second = stack.pop();
				double first = stack.pop();
				if (first < second){
					stack.push(1.0);
				}
				else{
					stack.push(0.0);
				}
			}
			else if(queue.peek().equals(">")){// if the next value is a >, it will push a 1.0 if the second value popped is greater than the first value popped. Otherwise it will push 0.0
				queue.dequeue();
				double second = stack.pop();
				double first = stack.pop();
				if(first > second){
					stack.push(1.0);
				}
				else{
					stack.push(0.0);
				}
			}
			else if(queue.peek().equals("=")){ // if the next value is a =, it will see if the two values popped are equal to each other. If they are it will push 1.0, otherwise it will push 0.0
				queue.dequeue();
				double second = stack.pop();
				double first = stack.pop();
				if (first == second){
					stack.push(1.0);
				}
				else{
					stack.push(0.0);
				}
			}
			else if(queue.peek().equals("!")){ //if the next value is a !, it will pop one value and push 1.0 if the popped value is 0.0 or push 0.0 if the popped value is 1.0
				queue.dequeue();
				double first = stack.pop();
				if(first == 1.0){
					stack.push(0.0);
				}
				else{
					stack.push(1.0);
				}
			}
			else if(queue.peek().equals("&")){//if the next value is &, it will push a 1.0 if both popped values are 1.0 or it will push 0.0 if they are not both 1.0
				queue.dequeue();
				double second = stack.pop();
				double first = stack.pop();
				if(first == 1.0 && second == 1.0){
					stack.push(1.0);
				}
				else{
					stack.push(0.0);
				}
			}
			else if(queue.peek().equals("|")){//if the next value is |, it will push a 1.0 if one of them is 1.0 or it will push a 0.0 is neither are 1.0
				queue.dequeue();
				double second = stack.pop();
				double first = stack.pop();
				if(first == 1.0 || second == 1.0){
					stack.push(1.0);
				}
				else{
					stack.push(0.0);
				}
			}
			else{
				double pusher = Double.parseDouble(queue.dequeue()); //if the next value is not an operator, it will dequeue the next value and convert it to a double. Then push this double into the stack
				stack.push(pusher);
			}
			
			
		}//end for loop
		
		return stack.pop(); //return the double left in the stack after all operations have been performed
	}//end method

}//end class
