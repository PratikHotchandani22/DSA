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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




class stacksusingQueue
{
     Queue<Integer> q = new LinkedList<Integer>();
     Queue<Integer> tempQ = new LinkedList<Integer>();
     
     
     void push(int data)
     {
         if(q.size()==0)
         {
             q.add(data);
         }
         else
         {
             int l =q.size();
             for(int i=0;i<l;i++)
             {
                 tempQ.add(q.remove());
             }
             q.add(data);
             
             for(int i=0;i<l;i++)
             {
                 q.add(tempQ.remove());
             }
             
         }
     }
     
     int pop() throws Exception
     {
         if(q.size()==0)
         {
             throw NoSuchElementException("Underflow Exception");
         }
         return q.remove();
     }
     
     int peek() throws Exception
     {
         if(q.size()==0)
         {
             throw NoSuchElementException("Underflow exception");
         }
         return q.peek();
         
     }
     
     void display()
     {
         if(q.size()==0)
         {
             System.out.println("It is empty");
         }
         else
         {
             Iterator it = q.iterator();
             while(it.hasNext())
             {
                 System.out.println(it.next() + " ");
             }
             System.out.println("");
         }
     }

    private Exception NoSuchElementException(String underflow_Exception) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}

public class StackUsing2Queues {
    public static void main(String[] args) {
        
        stacksusingQueue st = new stacksusingQueue();
        Scanner in = new Scanner(System.in);
        System.out.println("What");
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. peek");
        System.out.println("4. display");
        System.out.println("Enter choice");
        int n = in.nextInt();
        switch(n)
        {
            case 1: 
                System.out.println("Enter element to push");
                st.push(in.nextInt());
                break;
                
            case 2:
                System.out.println("popping");
                try
                {
                    st.pop();
                    
                }
                catch(Exception e)
                {
                    System.out.println("Error" + e.getMessage());
                }
                break;
                
                
            case 3:
                System.out.println("peeking");
                try
                {
                    st.peek();
                }
                catch(Exception e)
                        {
                            System.out.println("Error" + e.getMessage());
                        }
                break;
                
            case 4:
                System.out.println("stack is: " );
                st.display();
                break;
                
        }
        
        
        
    }
    
}
