/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PreFix;

/**
 *
 * @author HOTIE
 */
import java.io.*;
import java.util.*;


public class InfixToPrefix {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack st = new Stack();
        System.out.println("String entered is: " + s);
        
        //fiding reverse of the string
        String rev = new String("");
        
        for(int i=s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println("Reversed string is: " + rev);
        String s1[] = rev.split(" ");
        s = "";
        
        //finding postfix of the reversed string
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].matches("^[a-zA-Z0-9]+$"))
            {
                System.out.println("matches in the regex");
                s= s+ s1[i];
                System.out.println("s is: " + s);
                
            }
            else
            {
                System.out.println("found operator: " + s1[i]);
                if(st.isEmpty())
                {
                    st.push(s1[i]);
                    System.out.println("Stack is: " + st);
                }
                else
                {
                    if(s1[i].equals("*") || s1[i].equals("/"))
                    {
                        st.push(s1[i]);
                        System.out.println("updated stack is: " + st);
                    }
                    else if(s1[i].equals("+") || s1[i].equals("-"))
                    {
                        if(st.peek().equals("*") || st.peek().equals("/"))
                        {
                            System.out.println("we will have to pop all the operators in the stack");
                            int x = st.size();
                            for(int k=0;k<x;k++)
                            {
                                s = s + st.pop();
                            }
                            st.push(s1[i]);
                            
                        }
                    }
                }
            }
        }
        
        int x = st.size();
        System.out.println("String ended, therefore emtyping the string");
        for(int i=0;i<x;i++)
        {
            s = s + st.pop();
        }
        rev = "";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        System.out.println("String is: " + rev);
    }
    
}
