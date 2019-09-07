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

class nodes
{
    nodes next;
    int data;
    
}

class Ll
{
    nodes head;
    
    void addAtBeg(int data)
    {
        nodes node = new nodes();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
        
    }
    
    void insert(int data)
    {
        nodes node = new nodes();
        node.data = data;
        node.next = null;
        
        if(head == null)
        {
            head = node;
            
        }
        else
        {
            nodes n = head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next= node;
        }
        
    }
    
    void addAtPos(int index, int data)
    {
        nodes node = new nodes();
        node.data = data;
        node.next = null;
        if(index==0)
        {
            addAtBeg(data);
        }
        else
        {
            nodes n = head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    
    void delete(int index)
    {
        nodes node = new nodes();
        node = head;
        nodes n2 = null;
        
        
        for(int i=0;i<index-1;i++)
        {
            node=node.next;
        }
        n2= node.next;
        node.next = n2;
        System.out.println("deleted data is: " + n2.data);
        
        
    }
    
    void show()
    {
        nodes node = new nodes();
        while(node.next!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println(node.data);
    }
}

class s
{
    int top = 0;
    int[] stack = new int[5];
    
    
    void push(int data)
    {
        if(top == 5)
        {
            System.out.println("Stack is fulll");
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
            System.out.println("Alreat empty");
        }
        
        else
        {
            top--;
            data = stack[top];
            stack[top] = 0;
            System.out.println("Popped data is: ");
        }
        return data;
    }
    
    int peek()
    {
        int data = 0;
        if(isEmpty())
        {
            System.out.println("Nothing in stack now");
        }
        else
        {
            data = stack[top-1];
            System.out.println("Peeked element is " );
        }
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

class que
{
    int[] queue = new int[5];
    int front = 0;
    int size = 0;
    int rear = 0;
    
    
    void Enqueue(int data)
    {
        if(!isFull())
        {
            queue[rear] = data;
            rear = (rear + 1)%5;
            size++;
        }
        else
        {
            System.out.println("Queue is full");
        }
        
    }
    
    int Dequeue()
    {
        int data = queue[front];
        if(!isEmpty())
        {
            front = (front+1)%5;
            size--;
        }
        else
        {
            System.out.println("Queue is already empty");
        }
        return data;

        
    }
    
    
    void show()
    {
        System.out.println("Elements are: " );
        for(int i=0;i<size;i++)
        {
            System.out.println( queue[(front+i)%5]);
        }
    }
    
    int getSize()
    {
       return size;
       
    }
    
    boolean isEmpty()
    {
        return size==0;
        
    }
    
    boolean isFull()
    {
        return size==5;
    }
    
    
    
}


public class DSA {

    public static void main(String[] args) {
        
        Ll LinkedList = new Ll();
        s Stack = new s();
        que queue = new que();
        
        System.out.println("What do you want to perform?");
        System.out.println("1. Linked list");
        System.out.println("2. Stack");
        System.out.println("3. Queue");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        switch(n)
        {
            case 1: 
                System.out.println("Will perform  Linked List");
                System.out.println("What do you want to do in LinkedList? ");
                System.out.println("1. Insert element at the end");
                System.out.println("2. Enter element at the beg");
                System.out.println("3. Enter element at a specific pos");
                System.out.println("4. Delete a element");
                System.out.println("5. Show");
                int li = in.nextInt();
                switch(li)
                {
                    
                }
                
                
            case 2:
                System.out.println("will perform Stacks");
                System.out.println("What in stacks?");
                System.out.println("1. Push an element");
                System.out.println("2. pop an element");
                System.out.println("3. peek element");
                System.out.println("Show stack");
                int s = in.nextInt();
                switch(s)
                {
                    case 1:
                        System.out.println("Enter number to push");
                        int x = in.nextInt();
                        Stack.push(x);
                        break;
                        
                    case 2:
                        Stack.pop();
                        break;
                        
                    case 3:
                        Stack.peek();
                        break;
                    
                    case 4:
                        Stack.show();
                        break;
                        
                    default:
                        System.out.println("Enter a valid input");
                        break;
                        
                }
                
                
            case 3: 
                System.out.println("Will perform queue");
                System.out.println("what in queue?");
                System.out.println("1. Enqueue");
                System.out.println("2. Dequeue");
                System.out.println("3. Show completer queue ");
                int q = in.nextInt();
                switch(q)
                {
                    case 1: 
                         System.out.println("Enter number to enter");
                         int x = in.nextInt();
                         queue.Enqueue(x);
                         break;
                         
                    case 2: 
                        queue.Dequeue();
                        break;
                        
                    case 3:
                        queue.show();
                        break;
                        
                        
                    default:
                         System.out.println("Enter valid number");
                         break;
                         
                }
                
        }
        
        
        
        
    }
    
}
