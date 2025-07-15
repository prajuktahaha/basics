import java.util.*;
public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows in a matrix:");
        int rows = sc.nextInt();
        System.out.println("Enter the no.of columns in a matrix :");
        int cols = sc.nextInt();
        System.out.println("Enter the numbers:");
        int[][] numbers = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();

        for(int i = 0 ; i< rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                if(numbers[i][j]==x){
                    System.out.println("x found at location ("+ i + " , " + j + ")");
                }
            }
        }
    }
}
