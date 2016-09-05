import java.util.Scanner;
public class Prime{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter prime to find: ");
        int prime = in.nextInt();
        int size = (int)(prime*Math.log(prime)*2);
        //read in the size from the user and compute size of array needed
        long start = System.currentTimeMillis();
        //start the timer
        boolean[] sieve = new boolean[size];
        for(int i=2; i<size; i++){
            sieve[i]=true;
            //go through the whole array and set to true
        }
        for(int i=2; i<Math.sqrt(size); i++){
            //go through array up to sqrt(size)
            for(int j=i*i; j<size; j=j+i){
                //put all the multiples of these values = false
                sieve[j]=false;
                //do this by going up in jumps of i
            }
        }
        int counter =0;
        int slot=1;
        while(counter<prime){
            slot++;
            if (sieve[slot]==true){
                //find the correct prime by counting up
                counter++;
            }
        }
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("The "+prime+"th prime number is"+slot);
        System.out.println("The answer took "+elapsed+"milliseconds to computer");
    }
}