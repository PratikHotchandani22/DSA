/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placementprep;

/**
 *
 * @author HOTIE
 */

import java.io.*;
import java.util.*;


public class balancingParentheses {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean poss = false;
        Stack st = new Stack();
        String[] s1 = s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            //System.out.println("stack is: " + st);
            System.out.println("i is: " + i + " and s1[i] is: " + s1[i]);
            if(s1[i].equals("{") || s1[i].equals("[") || s1[i].equals("("))
            {
                
                st.push( s1[i] );
                System.out.println("Stack is: " + st);
            }
            else if( s1[i].equals("}") || s1[i].equals("]") || s1[i].equals(")"))
            {
                
                if(s1[i].equals("}"))
                {
                    if(st.peek().equals("{"))
                    {
                        
                        System.out.println("found in string is: " + s1[i] + " And in stack is: " + st.peek());
                        poss= true;
                    }
                    else
                    {
                        break;
                    }
                }
                if(s1[i].equals("]"))
                {
                    if(st.peek().equals("["))
                    {
                        System.out.println("found in string is: " + s1[i] + " And in stack is: " + st.peek());
                        poss = true;
                    }
                    else
                    {
                        break;
                    }
                }
                if(s1[i].equals(")"))
                {
                    if(st.peek().equals("("))
                    {
                        System.out.println("found in string is: " + s1[i] + " And in stack is: " + st.peek());
                        poss = true;
                    }
                    else
                    {
                        break;
                    }
                }
                
                
               
            }
             else
                {
                    //System.out.println("Not balanced");
                    
                    System.out.println("not balanced because string is: " + s1[i] + " and in stack is: " + st.peek());
                    poss= false;
                    break;
                }
            
        }
        if(poss)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println("Not balanced");
        }
    }
}
