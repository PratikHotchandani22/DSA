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

class qu
{
    int queue[] = new int[5];
    int size= 0 ;
    int front =0;
    int rear = 0;
    
    void enqueue(int data)
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
    
    int deque()
    {
        int data = queue[front];
        if(!isEmpty())
        {
            
            front = (front+1)%5;
            size--;
        }
        else
        {
            System.out.println("Queue is Empty");
        }
            
        
        return data;
        
    }
    
    int getSize()
    {
        return size;
    }
    
    boolean isEmpty()
    {
        return getSize()==0;
    }
    
    boolean isFull()
    {
        return getSize()==5;
    }
    
    void show()
    {
        System.out.println("Elements are: " );
        for(int i=0;i<size;i++)
            
        {
            System.out.print(queue[(front + i)%5] + " ");
        }
    }
    
}


public class Queue {
    public static void main(String[] args) {
     qu q = new qu();
//     q.enqueue(999);
//     q.enqueue(434);
//     q.enqueue(9);
//     q.enqueue(44);
//     q.enqueue(99);
     q.deque();
//     q.deque();
//     q.enqueue(7);
//     q.enqueue(7);  
//     q.deque();
     
    // q.enqueue(7);
     //q.enqueue(7);
     
     q.show();
    }
    
}
