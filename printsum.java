import java.util.*;
public class printsum{
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 2 numbers to calculate sum : ");
        int a = sc.nextInt();
        int b =  sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("Sum of 2 number is : " + sum);
    }
    
}
