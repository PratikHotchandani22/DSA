/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

/**
 *
 * @author HOTIE
 */
import java.io.*;

import java.util.*;

class queueusingStacks
{
    Stack<Integer> s =  new Stack<Integer>();
    Stack<Integer> tmp = new Stack<Integer>();
    
    
    void Enqueue(int data)
    {
        if(s.size() == 0)
        {
            s.push(data);
        }
        else
        {
            int l = s.size();
            for(int i=0;i<l;i++)
            {
                tmp.push(s.pop());
            }
            s.push(data);
            
            for(int i=0;i<l;i++)
            {
                s.push(tmp.pop());
            }
        }
        
    }
    
    int deQueue() throws Exception
    {
        if(s.size() == 0)
        {
            System.out.println("Empty");
        }
        return s.pop();
    }
    
    int peek() throws Exception
    {
        if(s.size()==0)
        {
            throw new NoSuchElementException("Underflow Exception");
        }
        else
        {
            return s.peek();
        }
    }
    
    
}

public class QueueUsing2Stacks {
    public static void main(String[] args) {
        
    }
    
}
