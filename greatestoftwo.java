import java.util.Scanner;
public class greatestoftwo {
    public static int greatest(int a , int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
        System.out.println("Enter the valye of b :");
        int b = sc.nextInt();
        int greatest = greatest(a,b);
        System.out.println("Greatest of " + a + " and " + b + " is : " + greatest);
    }
    
}
