/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostFix;

/**
 *
 * @author HOTIE
 */

import java.io.*;
import java.util.*;


public class InfixToPostFix {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string in infix expression form");
        String s = in.nextLine();
        //We will push operators in this stac
        Stack st = new Stack();
        //concatinating the string with ans
        String res = "";
        String s1[] = s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].matches("^[a-zA-Z0-9]+$"))
            {
                System.out.println("matches");
                res = res + s1[i];
                System.out.println("res is: " + res);
            }
            else
            {
                System.out.println("operator found : "  + s1[i]);
                if(st.isEmpty())
                {
                    st.push(s1[i]);
                    System.out.println("stack is : " + st);
                }
                else
                {
                    if(s1[i].equals("*") || s1[i].equals("/"))
                    {
                        st.push(s1[i]);
                        System.out.println("stack is : " + st);
                    }
                    else if(s1[i].equals("+") || s1[i].equals("-"))
                    {
                        if(st.peek().equals("*") || st.peek().equals("/"))
                        {
                            System.out.println("we will have to pop all operators now");
                            System.out.println("size of stack is: " + st.size());
                            int x = st.size();
                            for(int k=0;k<x;k++)
                            {
                                res = res + st.pop();
                                
                            }
                            st.push(s1[i]);
                        }
                    }
                }
                
            }
        }
        int x = st.size();
        System.out.println("end of the string");
        System.out.println("Empyting the stack");
        for(int i=0;i<x;i++)
        {
            res = res + st.pop();
        }
        System.out.println("res is: " + res);
        
    }
    
}
