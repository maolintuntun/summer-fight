package Dequebythreestacks;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    Deque<Integer> s1 = new LinkedList<>();
    Deque<Integer> s2 = new LinkedList<>();
    Deque<Integer> s3 = new LinkedList<>();
    
  
  public void shuffle()  //inner helper method upper class wrong!! DaXiaoXie
  {  
    while(!s2.isEmpty())
    {
      s1.push(s2.pop());
    }
    
    int s = (s1.size() + s2.size())/2;


    while(s1.size() > s)
    {
      s3.push(s1.pop());
     
    }
    
    while(!s1.isEmpty())
    {
      
      s2.push(s1.pop());
     
    }
    while(!s3.isEmpty())
    {
     
      s1.push(s3.pop());
    }

  }
  
  public void offerFirst(int element) {
    
    s1.push(element);
  }
  
  public void offerLast(int element) {
    shuffle();
    s2.push(element);
  }


public Integer pollFirst() {
    if(s1.isEmpty()&&s2.isEmpty())
    {
      return null;

    }else if(s1.isEmpty() && s2.size()==1){ // size bracket forget
      int p = s2.peek();
      s1.push(s2.pop());
      return p;
    }else if(s1.size()==1 && s2.isEmpty())
    {
      int q = s1.peek();
      s1.pop();
      return q;
    }
    shuffle();
    int r = s1.pop();
    return r;
  }
  
  public Integer pollLast() {
	  if(s1.isEmpty()&&s2.isEmpty())
	    {
	      return null;

	    }else if(s2.isEmpty() && s1.size()==1){ // size bracket forget
	      int p = s1.peek();
	      s2.push(s1.pop());
	      return p;
	    }else if(s2.size()==1 && s1.isEmpty())
	    {
	      int q = s2.peek();
	      s2.pop();
	      return q;
	    }
	    shuffle();
	    int r = s2.pop();
	    return r;
	  }
  
  public Integer peekFirst() {
    if(s1.isEmpty() && s2.isEmpty())
    {
        return null;
        
    }else if(s1.isEmpty() && s2.size()==1)
    {
      return s2.peek();
    }else
    {
      shuffle();
      return s1.peek();
    }  
  }
  
  public Integer peekLast() {
    if(s2.isEmpty() && s1.isEmpty())
    {
       return null;

    }else if(s2.isEmpty() && s1.size()==1)
    {
       return s1.peek();
    }else
    {
      shuffle();
      return s2.peek();
    }
  }
  
  public int size() {
    int s = s1.size()+s2.size(); //int 忘了
    return s;
  }
  
  public boolean isEmpty() {
    if(s1.isEmpty() && s2.isEmpty())
    {
      return true;
    }
    return false;
  }
}