import java.util.*;
public class Average{
    public static double calAverage(int a , int b , int c){
       int n = 3;
       return(a+b+c)/n;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a , b , c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double average = calAverage(a,b,c);
        System.out.println("average of " + a + " , " + b + " , " + c + " is: " +average);
    }
}
