/*
An old woman goes to market and a horse steps on her basket and crushes the
eggs. The rider offers to pay for the damages and asks her how many eggs she had
brought. She does not remember the exact number, but when she had taken them
out two at a time, there was one egg left. The same happened when she picked
them out three, four, five, and six at a time, but when she took them seven at a time
they came out even. Write a program that figures out the smallest number of eggs
she could have had.*/

public class CS210Lab2Prob2
{
   public static void main(String args[])
   {
       for(int i = 1; i < 1000000; i++)
       {
           int m2 = i % 2;
           int m3 = i % 3;
           int m4 = i % 4;
           int m5 = i % 5;
           int m6 = i % 6;
           int m7 = i % 7;
           
           if( m2 == 1 && m3 == 1 && m4 == 1 && m5 == 1 && m6 == 1 && m7 == 0)
           {
               System.out.println("The basket contained " + i + " eggs.");
               break;
           }
       }
   }
}
