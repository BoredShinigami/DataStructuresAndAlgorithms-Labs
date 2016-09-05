public class Rolls {
    public static void main (String[] args)
    {
        int n=1;
        int accuracy=10000;
        //n is the number of groups of 6 dice
        //accuracy is the number of times to repeat the experiment
        double count=0;
        for(int j=0;j<accuracy;j++){
            boolean success=false;
            int counter=0;
            while(!success){
                success=true;
                int[] array={0,0,0,0,0,0};
                for(int i=0;i<6*n;i++){
                    int random = (int)(Math.random()*6);
                    array[random]++;
                }
                int result=array[0];
                for(int i=1;i<6;i++){
                    if(array[i]!=result){
                        success=false;
                        break;
                    }
                }
                counter++;
            }
            count=count+counter;
        }
    System.out.println("The number of rolls was "+count/accuracy);
    }
}