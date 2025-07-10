import java.util.*;
public class factorial {
    public static int calFactorial(int n){
        if(n==0){
            return 1;
        }
        return n*calFactorial(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        int factorial = calFactorial(n);
        System.out.println("Factorial of " + n + " is :" + factorial);
    }
    
    
}
