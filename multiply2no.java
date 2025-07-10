import java.util.Scanner;
public class mul2usingfunction{
    public static int multiply(int a , int b){
        int product = a*b;
        return product;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multiply(a , b);
        System.out.println("product of " + a + " and " + b + " is : " +product);
    }
}
