import java.util.*;
public class A {
    public static void main(String[] args) {
        int a,b,Dif;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the First number:");
        a=ob.nextInt();
        System.out.println("Enter the second number:");
        b=ob.nextInt();
        
        Dif=a-b;
        System.out.println("Difference of the number is: "+Dif);
    }
}
