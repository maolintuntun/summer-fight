package stackimplementQueue;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue{
	
    private Deque<Integer> in = new LinkedList<>();   //create two instance variable
    private Deque<Integer> out = new LinkedList<>();

    // this is a helper method
    private void shuffle() {
    	if (out.isEmpty()) {
    		while( out.isEmpty() ) {
    			out.push( in.pop() );
    		}
         }
    }

    public Integer poll() {     //no need input parameter. why Integer? consider null 

	     // if out stack is empty,
	     // need to move the elements from in stack to out stack.

    	shuffle();

	     // return out.isEmpty() ? null ：out.pop(value);

    	if (out.isEmpty()) {
             while( ! in.isEmpty() ) {
                  out.push( in.pop() );
              }
   		  }

	    // 2 condition 1.when out is empty means in is also empty
	    // 2. when out is not empty, just pop out is ok
    	if( out.isEmpty() ) {
    		return null;
    	} else {
    		return out.pop() ; //1. don’t forget return. 2. one pop is enough
    	}
    }

    	public void offer( int value ) { //why void? because no need return sth
	
    			in.push(value);

    		}

    	public Integer peek() { 
    		// peek the head(first enter thing) of the queue. it is top of the out stack

    			if (out.isEmpty()) {
                     while( ! in.isEmpty() ) {
                    	 	out.push( in.pop() );
                     }
    			}

	        // replace as shuffle() method ---------- see on the top

    			shuffle();
                if( out.isEmpty()){

  	       				return null;

  	       			} else {
  	       				
  	       				return out.peek();
  	       			}
    		}
    	

    	public boolean isEmpty() {
    			return in.isEmpty() && out.isEmpty();
    	}

    	public int size() {
    		return in.size() + out.size();
    	}
}
