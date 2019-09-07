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


class st
{
    int top = 0;
    int stack[] = new int[6];
    
    
    void push(int data)
    {
        
       if(top==5)
       {
           System.out.println("Already full");
       }
       else
       {
           stack[top] = data;
           top++;
       }
       
       
    }
    
    int pop()
    {
        int data = 0;
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            
            top--;
            data = stack[top];
            stack[top] = 0;
            System.out.println("popped data is: ");
            
        }
        return data;
        
        
    }
    
    
    int peek()
    {
        int data;
        
        data = stack[top-1];
        System.out.println("peeked element is: ");
        return data;
    }
    
    void show()
    {
        for(int n: stack)
        {
            System.out.println(n);
        }
    }
    
    boolean isEmpty()
    {
        return top<=0;
    }
    
    
}


public class Stacks {
    public static void main(String[] args) {
        
        st nums = new st();
        nums.push(20);
        nums.push(60);
        nums.push(80);
        nums.push(90);
        nums.show();
        System.out.println(nums.pop());
        System.out.println(nums.peek());
        System.out.println("After popping");
        nums.show();
    }
}
