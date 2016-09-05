public class Collatz {
    public static void main (String[] args){
        int[] array = new int[10000000];
        int biggest=0;
        int bignum=0;
            for(int i =1; i<10000000; i++){
                long n=i;
                int counter=1;
                    while(n!=1){
                        if(n<1000000){
                            int num=(int)n;
                            if(array[num]>0){
                                counter=counter+array[num];
                                break;
                            }
                        }
                        if (n%2==0){
                            n=n/2;
                        }else{
                            n=3*n+1;
                        }
                        counter++;
                    }
                if(counter>biggest){
                    biggest=counter;
                    bignum=i;
                    System.out.println(i+" "+counter);
                }
                array[i]=counter-1;
            }
        System.out.println("The longest sequence was "+biggest+" for "+bignum);
    }
}