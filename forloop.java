import java.util.*;

public class forloop {
    public static void main(String args[]){

       System.out.println("Enter a no. which you want to Print table .");

       Scanner sc=new Scanner(System.in);

       int no = sc.nextInt();

       for(int i=1; i<=10; i++){
           int result = no * i;
           System.out.println(result);
       }
    }
}
