import java.util.*;

public class dowhileloop {
    public static void main(String args[]){

        System.out.println("Enter your name : ");
        Scanner sc=new Scanner(System.in);

        String name =sc.nextLine();

        System.out.println("Enter no. : that how many time you want to print your name :");

        int no =sc.nextInt();

        int i=0;
        do {
            System.out.println(name);
            i++;
        }while(i<=no);
    }
}
