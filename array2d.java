import java.util.*;

public class array2d {
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many row you want : ");

        int row = sc.nextInt();

        System.out.println("Enter how many column you want");
        int clumn = sc.nextInt();

        System.out.println("Enter the value of row and column : ");

        int [][] num = new int[row][clumn];

        for(int i=0; i<row; i++){
            for(int j=0; j<clumn; j++){
                num [i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<clumn; j++){
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }





    }
}
