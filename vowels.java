import java.util.*;
public class vowels {
    public static void main(String[] args) {
        System.out.println("enter the character");
        Scanner sc =new Scanner(System.in);
         char ch = Character.toLowerCase(sc.next().charAt(0));
         if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
         {
             System.out.println( ch +"the character is vowel");
         }
         else{
             System.out.println(ch + "the character is consonant");
         }
    }
}
