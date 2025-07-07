import java.util.*;
public class perimeter {
 public static void main(String[]args) {
	 Scanner sc = new Scanner (System.in);
	 System.out.println("choose the shape u want to find perimeter of");
	 System.out.println("1. Rectangle");
	 System.out.println("2. Square");
	 System.out.println("3. Circle");
	 System.out.println("4. Triangle");
	 int choice = sc.nextInt();
	 
	 if (choice==1) {
		 System.out.println("Enter the length of the Rectangle: ");
		 double length = sc.nextDouble();
		 System.out.println("Enter the breadth of the Rectangle: ");
		 double breadth = sc.nextDouble();
		 double perimeter = 2*(length + breadth);
		 System.out.println("perimeter of rectangle: " + perimeter);
	 }
	 else if (choice==2) {
		 System.out.println("Enter side: ");
		 double side = sc.nextDouble();
		 double perimeter = 4 * side;
		 System.out.println("perimeter of square: "+ perimeter);
	 }
	 else if (choice==3) {
		 System.out.println("Enter radius: ");
		 double radius = sc.nextDouble();
		 double perimeter =2 * 3.14 * radius;
		 System.out.println("perimeter of circle: "+ perimeter);
	 }
	 else if (choice==4) {
		 System.out.println("Enter side a: ");
		 double sidea= sc.nextDouble();
		 System.out.println("Enter side b: ");
		 double sideb = sc.nextDouble();
		 System.out.println("Enter side c: ");
		 double sidec = sc.nextDouble();
		 double perimeter = (sidea + sideb + sidec);
		 System.out.println("perimeter of triangle: "+ perimeter);
	 }
	 else {
		 System.out.println("invalid choice");
	 }
	 sc.close();
 }
}
