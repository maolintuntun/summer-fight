package minstack;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    Deque<Integer> stack = new LinkedList<>();
    Deque<Integer> min = new LinkedList<>();

    public void push(int value) {
	stack.push(value) ;
           if( min.isEmpty() || value <= min.peek() ) { // when we haven’t put anything into min 
 	      min.push( value ) ;
           }

   }

   public Integer peek() {
        if( stack.isEmpty()) {
        	return null;
         }
        return stack.peek();
   }

   public Integer pop() {
        if( stack.isEmpty()) {
              return null ; 
       }
       int p = stack.pop();
       if ( p == min.peek()) {
           min.pop() ;
         }
       return p;                           //not return stack.pop() ; 
       
    }

  public Integer size() {
       return stack.size() ;
  }

  public boolean isEmpty() {
      return stack.isEmpty() ;
 }
  
  public Integer min() {
     if( min.isEmpty()) {
        return null;
         }
     return min.peek() ;
   }

}
