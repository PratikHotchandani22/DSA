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


public class PostFixOfLengthGreaterthan1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        Stack st = new Stack();
        String s1[] = s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            if(s1[i].matches("^[a-zA-Z0-9]+$"))

            {
                st.push(s1[i]);
                System.out.println("stack is: " + st);
                
                
            }
            else
            {
                System.out.println("Founds");
                int op1 = Integer.parseInt(String.valueOf(st.pop()));
                int op2 = Integer.parseInt(String.valueOf(st.pop()));
                System.out.println("popped is: " + op1 + " and " + op2 );
                int res = 0;
                if(s1[i].equals("+"))
                {
                    res = op2 + op1;
                    
                }
                else if(s1[i].equals("-"))
                {
                    res = op2 - op1;
                }
                else if(s1[i].equals("*"))
                {
                    res = op2 * op1;
                }
                else if(s1[i].equals("/"))
                {
                    res = op2 / op1;
                }
                st.push(res);
                System.out.println("new stack is: " + st);
            }
        }
        
        System.out.println("Finished performing operations");
        System.out.println("Answer is: " + st.pop());
        
        
    }
    
}
