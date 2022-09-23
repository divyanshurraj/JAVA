import java.util.*;
public class A {
    public static void main(String[] args) {
        float S1,S2,S3,S4,S5,avg;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the marks of Subject 1:");
        S1=ob.nextFloat();
        System.out.println("Enter the marks of Subject 2:");
        S2=ob.nextFloat();
        System.out.println("Enter the marks of Subject 3:");
        S3=ob.nextFloat();
        System.out.println("Enter the marks of Subject 4:");
        S4=ob.nextFloat();
        System.out.println("Enter the marks of Subject 5:");
        S5=ob.nextFloat();
      avg=(S1+S2+S3+S4+S5)/5;
        System.out.println("The Average marks of the student is : "+avg);
    }
}
