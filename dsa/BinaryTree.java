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

class BTNode
{
    BTNode left,right;
    int data;
    
    public BTNode()
    {
        left = null;
        right = null;
        data = 0;
        
    }
    
    public BTNode(int n)
    {
        left = null;
        right = null;
        data = n;
        
    }
    
    public void setLeft(BTNode n)
    {
        left = n;
        
    }
    
    public void setRight(BTNode n)
    {
        right = n;
        
    }
    
    public BTNode getLeft()
    {
        return left;
    }
    
    public BTNode getRight()
    {
        return right;
    }
    
    public void setData(int d)
    {
        data = d;
    }
    
    public int getData()
    {
        return data;
    }
    
}

class BT
{
    private BTNode root;
    
    public BT()
    {
       root = null;
    }
    
    public boolean isEmpty()
    {
        return root == null;
    }
    
    public void insert(int data)
    {
        root = insert(root,data);
    }
    
    private BTNode insert(BTNode node, int data)
    {
        if(node==null)
        {
            node = new BTNode(data);
        }
        else
        {
            if(node.getRight()==null)
            {
                node.right = insert(node.right,data);
            }
            else
            {
                node.left = insert(node.left,data);
            }
        }
        
        return node;
    }
    
    public int countNodes()
    {
        return countNodes(root);
    }
    
    private int countNodes(BTNode root)
    {
        if(root==null)
        {
            return 0;
        }
        else
        {
            int l =1;
            l = l + countNodes(root.getLeft());
            l = l + countNodes(root.getRight());
            return l;
        }
    }
    public boolean search(int val)
    {
        return search(root, val);
    }
    
    private boolean search(BTNode root,int val)
    {
        
        if(root.getData() == val)
        {
            return true;
        }
        if(root.getLeft()!=null)
        {
            if(search(root.getLeft(),val))
            {
                return true;
            }
        }
        if(root.getLeft()!=null)
        {
            if(search(root.getRight(),val))
            {
                return true;
            }
        }
        return false;
        
    }
    
    
    public void inOrder()
    {
        inOrder(root);
    }
    
    private void inOrder(BTNode root)
    {
        if(root!=null)
        {
            inOrder(root.getLeft());
            System.out.println(root.getData() + " ");
            inOrder(root.getRight());
        }
    }
    
    public void preOrder()
    {
        preOrder(root);
    }
    
    private void preOrder(BTNode root)
    {
        if(root!=null)
        {
            System.out.println(root.getData() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
            
        }
    }
    
    
    public void postOrder()
    {
        postOrder(root);
    }
    
    private void postOrder(BTNode root)
    {
        if(root!=null)
        {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.println(root.getData() + " ");
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BT bt = new BT();
        char c;
        do
        {
            
        
        System.out.println("Binary tree");
        System.out.println("\nBinary Tree Operations\n");
        System.out.println("1. insert ");
        System.out.println("2. search");
        System.out.println("3. count nodes");
        System.out.println("4. check empty");
        
        int n = in.nextInt();
        switch(n)
            
        {
            case 1:
                System.out.println("What do you want to insert? ");
                bt.insert(in.nextInt());
                break;
                
            case 2:
                System.out.println("Search what?");
                bt.search(in.nextInt());
                break;
                
            case 3:
                System.out.println("counting nodes");
                bt.countNodes();
                break;
                
            case 4:
                System.out.println("Check if empty");
                bt.isEmpty();
                break;
                
            default:
                System.out.println("Wrong entry");
                break;
                
        }  
                System.out.println("postOrder is: " );
                bt.postOrder();
                
                System.out.println("Inorder is ");
                bt.inOrder();
                
                System.out.println("preorder is:");
                bt.inOrder();
                
                System.out.println("continue? y or n ");
                c = in.next().charAt(0);
        } while(c=='y' || c== 'Y');
                
                    
                
                
                
        
    }
 
}
