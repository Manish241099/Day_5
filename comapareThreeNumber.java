import java.util.*;
public class comapareThreeNumber {
    public static void main(String[] args) {
        System.out.println("enter the valuer of x:");
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("enter the valuer of y:");

        int y=sc.nextInt();

        System.out.println("enter the valuer of z:");

        int z=sc.nextInt();
        if(x > y){
            if(x > z) {
                System.out.println("X is largest");
            }
                else {
                System.out.println("z is largest");
            }


                    }
        else{
            if(y > z) {
                System.out.println("y is largest");
            }
            else{
                System.out.println("z is largest");
            }
        }
                }
            }



