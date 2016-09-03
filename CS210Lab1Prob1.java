/* Write a program that figures out how many 
 * times you would have to fold a piece of paper
 * to reach the moon.
 */  

public class CS210Lab1Prob1
{
    public static void main(String args[])
    {
        long DistToMoonKm = 384400;
        long DistMoonmm = DistToMoonKm * 1000 * 100 * 10;
        double paperThickness = 0.1;
        
        for(long i = 1 ; i < 100000 ; i++)
        {
            paperThickness = paperThickness * 2;
            if (paperThickness >= DistMoonmm)
            {
                System.out.println(paperThickness);
                System.out.println(i);
                break;
            }
        }
    }
}
