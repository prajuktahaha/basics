import java.util.*;
public class exponential {
    public static int numberExponential(int x , int n) {
        int result = 1 ;
        for(int i = 1 ; i<=n ; i++){
            result*=x;
        }
        return result;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of x :");
        int x = sc.nextInt();
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int result = numberExponential(x,n);
        System.out.println(x + "raised to the power" + n + " is :" + result);
    }
}
