import java.util.*;
public class numbercount {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        char choice;
        do{
            System.out.println("Enter the number:");
            int num = sc.nextInt();
            if (num>0){
                positiveCount++;
            }
            else if(num < 0){
                negativeCount++;
            }
            else {
                zeroCount++;
            }
            System.out.println("Do you want to continue ? :");
            choice = sc.next().charAt(0);
        }
        while(choice == 'y'|| choice == 'Y');
        System.out.println("count of positive number : " + positiveCount);
        System.out.println("count of negative number : " + negativeCount);
        System.out.println("count of zero number : " + zeroCount);

        sc.close();
    }
}
