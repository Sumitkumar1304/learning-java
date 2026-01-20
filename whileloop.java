import java.util.*;


public class whileloop {
    public static void main(String args[]){

        System.out.println("Welcome Back");

        int cpassword = 1234;
        int password;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Password : ");
       password =sc.nextInt();

       while(password != cpassword){
           System.out.println("Wrong Password, Try again");
           password = sc.nextInt();
       }
       System.out.println("Correct Password");
       sc.close();

    }
}
