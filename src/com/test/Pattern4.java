package com.test;

public class Pattern4 {

    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++)
        {
           for(int j=2*3-i;j>=1;j--)
            {
                System.out.print(" * ");
            }
           for(int k=1;k<=1;k++)
            {
            System.out.println();
            }
        }

    }

}
