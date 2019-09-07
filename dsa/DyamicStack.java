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

class dst
{
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;
    
    
    void push(int data)
    {  
        if(size()==capacity)
        {
            expand();
        }
        stack[top] = data;
        top++;
        
    }
    
    void expand()
    {
        int length = size();
        int nstack[] = new int[capacity*2];
        System.arraycopy(stack,0,nstack,0,length);
        stack = nstack;
        capacity *= 2;
        
    }
    
    
    int pop()
    {
        int data = 0;
        if(isEmpty())
        {
            System.out.println("no element initially");
        }
        
        
        else
        {
        top--;
        data = stack[top];
        stack[top] = 0;
        
        shrink();
        }
        
        return data; 
    }
    void shrink()
    {
        int length = size();
        if(length<=(capacity/2)/2)
        {
            capacity = capacity/2;
            
        }
        int[] nstack = new int[capacity];
        System.arraycopy(stack,0,nstack,0,length);
        stack = nstack;
        
    }
    int peek()
    {
        int data;
        data = stack[top-1];
        return data;
    }
    
    void show()
    {
        for(int n: stack)
        {
            System.out.println(n);
        }
        
    }
    
    int size()
    {
       return top; 
    }
    
    boolean isEmpty()
    {
        return top<=0;
    }
            
}


public class DyamicStack {
    public static void main(String[] args) {
        
        dst nums = new dst();
        nums.push(9);
        nums.push(90);
        
        nums.push(90);
        nums.push(90);
        nums.push(90);
        nums.push(90);
        
        
        
        
        System.out.println(nums.peek());
        //System.out.println("popped is: " + nums.pop());
        System.out.println("Size is: " + nums.size());
        nums.show();
    }
}
