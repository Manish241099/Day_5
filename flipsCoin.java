import java.util.*;
public class flipsCoin {

    public static void main(String[] args) {
        int heads=0,tails=0;
        int count=1;

        double randum = 0.0;
        
        Scanner sc = new Scanner(System.in);
        int flips= sc.nextInt();
        while (flips<0) {

            System.out.println("invalid input please enter positive number");
            return;

        }

        while(count<= flips && flips > 0)
        {
            randum = Math.random();
            System.out.println(count +" " +randum);

            if(randum<0.5)
            {
                heads++;
                System.out.println("its a tail");
            }
               else
                {
                    tails++;
                  System.out.println("its a heads");

                }
                count++;

            
        }
        System.out.println("number of head" + heads);
        System.out.println("number of tails" + tails);

        double headperc = (double)flips/heads *100;
        double tailperc = (double)flips/tails *100;

        System.out.println("heads percentage:"+ headperc);
        System.out.println("tails percentage:"+ tailperc);

    }
    
}
