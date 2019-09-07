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


class Node
{
    int data;
    Node next;
    
}

class LinkedListers
{
    
    Node head;
    
    void addAtBeg(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }
    
    void addAtIndex(int index , int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null; 
        
        if(index == 0)
        {
            addAtBeg(data);
        }
        else
        {
                
            Node n = head;
            for(int i=0;i<index-1;i++)
            {
                n = n.next;
            }

            node.next = n.next;
            n.next = node;

            
        }
        
        
        
    
        
    }
    
    void insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if(head==null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next!=null)
            {
                n = n.next;
            }
            n.next= node;
        }
  
    }
    
    void show()
    {
        Node node = head;
        
        while(node.next!= null)
        {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    
    
    void del(int index)
    {
        if(index ==0)
        {
            head = head.next;
        }
        
        else
        {
            Node n = head;
            Node n1 = null;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n1 = n.next;
            n.next = n1.next;
            System.out.println("n1: " + n1.data);
            
        }
        
        
        
    }
    
    
}

public class LinkedList {
    public static void main(String[] args) {
     
        LinkedListers list = new LinkedListers();
        Scanner in = new Scanner(System.in);
        list.insert(90);
        list.insert(900);
        list.insert(3434);
        
        
        //inserting element at the end
        System.out.println("Enter element to enter ");
        int n= in.nextInt();
        list.insert(n);
        
        
        //adding element at the start
        
        System.out.println("Enter the number you want to add");
        int x = in.nextInt();
        list.addAtBeg(x);
        
        
        //adding element at a index
        
        System.out.println("Enter the position where you wamt tp enter");
        int pos = in.nextInt();
        
        System.out.println("Enter data");
        int da = in.nextInt();
        
        list.addAtIndex(pos,da);
        
        //Deleteing element
        System.out.println("Enter data you want to delete");
        int dele = in.nextInt();
        list.del(dele);
        
        
        
        list.show();
        
    }
    
}ha
