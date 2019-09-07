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


class queue
{
    int capacity = 2;
    int[] queue = new int[capacity];
    int size = 0;
    int front = 0;
    int rear = 0;
    
    
    void enQueue(int data)
    {
        if(!isFull())
        {
            queue[rear] = data;
            rear = (rear+1)%capacity;
            size++;
            
        }
        else
        {
            expand();
        }
    }
    
    void expand()
    {
        int length = getSize();
        int nqueue[] = new int[capacity*2];
        System.arraycopy(queue,0,nqueue,0,length);
        queue = nqueue;
        capacity *= 2;
    }
    
    int deQueue()
    {
        
        int data = queue[front];
        if(!isEmpty())
        {
            front = (front+1)%capacity;
            size--;
            shrink();
        }
        else
        {
            System.out.println("Already empty");
        }
        return data;
    }
    
    void shrink()
    {
        int length = getSize();
        if(length<=(capacity/2)/2)
        {
            capacity = capacity/2;
            
        }
        int[] nqueue = new int[capacity];
        System.arraycopy(queue,0,nqueue,0,length);
        queue = nqueue;
    }
    
    boolean isEmpty()
    {
        return getSize()==0;
    }
    
    int getSize()
    {
        return size;
    }
    
    boolean isFull()
    {
        return getSize()==5;
    }
    
}

public class BFS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Press 1 if there is a line between vertex a and vertex b, else press 0");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        
        int[] visitedArr = new int[n];
        
        queue q = new queue();
        q.enQueue()
        
    }
}
