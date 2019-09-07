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


public class SarthakQue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.nextLine();
        
        String sa[] = s.split(" ");
        for(int i=0;i<sa.length;i++)
        {
            char c[] = sa[i].toCharArray();
            for(int j=c.length-1;j>=0;j--)
            {
                if(j==c.length-1)
                {
                    System.out.print(c[0]);
                }
                else if(j==0)
                {
                    System.out.print(c[c.length-1]);
                }
                else
                {
                    System.out.print(c[j]);
                }
                
            }
            System.out.print(" ");
        }
        
    }
    
}
