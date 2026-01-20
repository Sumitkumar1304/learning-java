import java.util.*;
public class checkevenodd {

    public static void main(String args[]){

        System.out.println("Enter a no. which you want to check, It is even or odd.");

        Scanner sc=new Scanner(System.in);

        int x=sc.nextInt();

        if(x%2==0){
            System.out.println("Even no.");

        }
        else{
            System.out.println("Odd no.");
        }
    }
}
