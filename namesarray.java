import java.util.*;
public class names {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        for(int i = 0 ; i<size ; i++){
            names[i] =sc.next();
        }

        for(int i = 0 ; i<names.length ; i++){
            System.out.println("names" + (i+1)+" is :" + names[i]);
        }
    }
}
