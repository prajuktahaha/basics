import java.util.Scanner;
public class oddnosum {
    public static int calOddSum(int n){
        int sum = 0;
        for(int i =1 ; i<=n ; i+=2){
            sum += i;
        }
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n = sc.nextInt();
        int sum = calOddSum(n);
        System.out.println("Sum of all odd numbers from 1 to n is :" + sum );
    }
    
}
