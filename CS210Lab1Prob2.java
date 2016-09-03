/*If a chessboard was to have wheat placed upon each
square such that one grain was placed on 
the first square, two on the second, four on the third,
and so on (doubling the number of 
grains on each subsequent square), how many 
grains of wheat would be on the chessboard 
at the finish? Write a program to figure it 
out.*/

public class CS210Lab1Prob2
{
    public static void main(String args[])
    {
        int x = 2;
        double grain = 0;
        for(int i = 0; i < 64; i++)
        {
            grain = Math.pow(x,i) + grain;
        }
        System.out.println(grain);
    }
}
