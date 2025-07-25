import java.util.*;
public class string {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string1:");
        String name1 = sc.nextLine();
        System.out.println("Enter string2:");
        String name2 = sc.nextLine();
        if(name1.compareTo(name2)==0){
            System.out.println(name1 + "and " + name2 + "are equal");
        }
        else if(name1.compareTo(name2)<0){
            System.out.println(name1 + "is less than" + name2);
        }
        else{
            System.out.println(name1 + "is greater than" + name2);
        }
    }
}
