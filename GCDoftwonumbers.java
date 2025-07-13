import java.util.*;
public class GCDoftwo {
    public static int gcdOfTwoNumber(int a , int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number :");
        int num2 = sc.nextInt();
        int result = gcdOfTwoNumber(num1 , num2);
        System.out.println("GCD of " + num1 + "and" + num2 + "is :" + result);
    }
    
}
