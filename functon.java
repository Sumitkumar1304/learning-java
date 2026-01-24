import java.util.*;

public class functon {

    public static void printMyName(String name){
        System.out.println("Welcome to The Sumit Cloud World Mr. "+ name);
        return;
    }

    public static void main(String args[]){

        System.out.println("Enter Your name : ");
        Scanner sc=new Scanner(System.in);

        String name=sc.next();
        printMyName(name);

    }
}
