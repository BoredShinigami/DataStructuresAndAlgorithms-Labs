import java.util.Random;
public class CS210Lab3Prob1{
    public static void main(String[] args)
    {
    int[] results = new int[31];//declare an array to hold the results
    Dice[] array = new Dice[5];//declare an array to hold the dice
        for(int j=0;j<5;j++)
        {
            array[j]=new Dice();//fill each slot with a dice object
        }
        for(int i=0;i<1000000;i++)
        {
            //Monte Carlo simulation – loop a million times
            int sum =0;
            for(int j=0; j<array.length;j++)
            {
                sum+=array[j].getResult();
            }
            results[sum] = results[sum]+1;//add all the dice and increment that slot# by 1
        }
        System.out.print("Dice <- c(" + results[5] +","); //Makes for easy copy/paste of result into R for plotting 
        for(int i=6;i<results.length - 2;i++)
        {
            System.out.print(results[i] + ",");
        }
        System.out.print(results[results.length - 1] +")");
    }
}
