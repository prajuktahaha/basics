import java.util.Scanner;
public class circumferenceofcircle {
    public static double calCircumference(double radius){
        return 2* 3.14 *radius;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle :");
        double radius = sc.nextDouble();
        double circumference = calCircumference(radius);
        System.out.println("Circumference of the circle :" +circumference);
    }
}
