import java.util.*;
public class oddeven {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number to verify is it odd or even:");
        int number = sc.nextInt();
        if (number%2 == 0){
            System.out.println("It is an even number");
        }
        else{
            System.out.println("It's an odd number");
        }
    }
    
}
