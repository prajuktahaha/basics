import java.util.Scanner;
public class Fibonaccinumber {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the terms :");
        int n = sc.nextInt();
        int first = 0 , second = 1;
        System.out.print("The fibonacci series is : ");
        for(int i = 1 ; i<=n ; i++){
            System.out.print(first + " ");
            int next =first + second;
            first=second;
            second=next;
        }
        sc.close();
    }
}
