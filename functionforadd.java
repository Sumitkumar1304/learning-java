import java.util.*;


public class functionforadd {

    public static void addtwono(int a , int b, int no){

        switch (no){
            case 1 : System.out.println("Sum of a and b is : " + (a+b));
            break;

            case 2 : System.out.println("Substract of a and b is : " + (a-b));
            break;

            case 3 : System.out.println("Multiplication of a and b is : " + (a*b));
            break;

            case 4 : System.out.println("Division of a and b is : " +(a/b));
            break;

            default: System.out.println("Invalid Input ");

        }
        return;
    }


    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter no. a : ");
        int a =sc.nextInt();

        System.out.println("Enter no. b : ");
        int b =sc.nextInt();

        System.out.println("Enter no between 1 to 4 to perfrom operation on a and b ");
        int no = sc.nextInt();
        addtwono(a, b , no);



    }
}
