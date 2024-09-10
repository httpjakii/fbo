/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacci;
import java.util.Scanner;
/**
 *
 * @author CL3-PC36
 */
public class Fibonacci {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      
      System.out.println("Input Number:  ");
      int num = input.nextInt();
      
      int firstTerm = 0, secondTerm = 1;
      System.out.println("Fibonacci Series: ");
       
      for (int i  = 1; i <= num; i++)
      {
          System.out.println(firstTerm + " ");
          
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
          
      }
      }

}
