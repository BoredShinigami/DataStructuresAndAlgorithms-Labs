/*
A gross is a group of 144 items. A dozen is a group of 12 items. Write a program
where the user inputs the number of eggs they have and the program outputs this
quantity in terms of groups, dozens and single eggs.
*/
import java.util.*;

public class CS210Lab2Prob1
{
   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Number of eggs selected;    ");
       double eggs = input.nextInt();
       double gross = Math.floor(eggs/144);
       double dozen = Math.floor((eggs - (gross * 144)) / 12);
       double single = eggs - (gross * 144) - (dozen * 12);
       System.out.println("Gross; " + gross + "\tDozen; " + dozen + "\tSingle" + single);
   }
}
