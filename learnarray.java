import java.util.*;

public class learnarray {
    public static void main(String args[]){
        System.out.println("Learning about Array : ");

        Scanner sc=new Scanner(System.in);
System.out.println("Enter no. that how many no. of subjects that which you want to store in marks section : ");
        int size=sc.nextInt();
            int[] marks = new int[size];

System.out.println("Enter value of marks : ");
            for(int i=0; i<size; i++){
                marks[i] = sc.nextInt();

            }

            System.out.println("Enter the no. which you want to search : ");
            int x = sc.nextInt();


      System.out.println("This is your value of marks which you want to search : ");
       for(int i =0; i<size; i++){
           if(marks[i]==x){
               System.out.println(marks[i]);
           }


       }
    }
}
