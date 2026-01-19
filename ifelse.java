import java.util.*;

public class ifelse {
    public static void main(String args[]){

        System.out.println("Cheking that you are eligible for voting or not :");

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age :");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are eligible for voting.");
        }
        else{
            System.out.println("You are not eligible for voting.");
        }
    }
}
