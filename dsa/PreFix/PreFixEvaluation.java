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
public class PreFixEvaluation {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string pretfix expression to be evaluated");
        String s = in.nextLine();
        s.toLowerCase();
        Stack st = new Stack();
        char[] c = s.toCharArray();
        for(int i=c.length-1;i>=0;i--)
        {
            if((int)c[i]>=49 && (int)c[i]<=57)
            {
                st.push(c[i]);
                System.out.println("stack is: " + st);
                
            }
            
            else if((int)c[i]==42 || (int)c[i]==43 || (int)c[i]==45 || (int)c[i]==47)
            {
               int op1=Integer.parseInt(String.valueOf((st.pop())));
               int op2 = Integer.parseInt(String.valueOf(st.pop()));
               System.out.println("popped is: " + op1 + " and " + op2 );
               int x = 0 ;
               if(c[i] == '+')
               {
                   x = op1 + op2;
               }
               else if(c[i] == '-')
               {
                   x = op1-op2;
               }
               else if(c[i] == '*')
               {
                   x = op1 * op2;
               }
               else if(c[i] == '/')
               {
                   x = op1/op2;
               }
               st.push(x);
               System.out.println("new stack is: " + st);
            }
        }
        System.out.println("Finished performing operations");
        System.out.println("Answer is: " + st.pop());
    }
    
}
