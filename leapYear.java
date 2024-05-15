
import java.util.*;
public class leapYear {
    
    public static void main(String[] args) {

        System.out.println("enter the year");

        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if(year>1000 && year <9999){
            System.out.println("year is valid");

            }
        else{
            System.out.println("year is invailid");
            return;
        }
        if((year % 4 == 0) || (year %400==0  && year % 100 !=0))
        {
            System.out.println("year is Leap Year");

        }
        else{
            System.out.println("Year is not Leap Year");
        }
    }
}
