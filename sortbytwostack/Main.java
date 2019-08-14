package sortbytwostack;

import java.util.Deque;
import java.util.LinkedList;

public class Main{
	
	public static void main(String[] args) {
		Deque<Integer> stack1 = new LinkedList<>() ;
		Deque<Integer> stack2 = new LinkedList<>() ;
		
		stack1.push(12);
		stack1.push(34);
		stack1.push(1 );
		int temp;

		while( !stack1.isEmpty())
{
temp = stack1.pop();
while( !stack2.isEmpty() && temp < stack2.peek())
{
stack1.push(stack2.pop());
}
stack2.push(temp);
}



     while(!stack2.isEmpty())
     {
         System.out.println(stack2.pop());
     }
}
}
