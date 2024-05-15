
import java.util.*;
public class HarmonicNumber {
    
    public static void main(String[] args) {
        

        int sum=0;
        double result=0.0;
    
        System.out.println("enter the harmonic number");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if(number < 0){
            System.out.println("enter the valid number");
            return;
        }
        for (int i=number;i>0;--i)
        { 
            result = result + (double)1/i;
            System.out.format("harmonic number: %.2f", result);


            
      
        }
          
    }
}
