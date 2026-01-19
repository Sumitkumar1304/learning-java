import java.util.*;
public class operators {

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        System.out.println("We will see some operation on these no. :");
        System.out.println("Enter value of a :");
        int a=sc.nextInt();

        System.out.println("Enter value of b :");
        int b = sc.nextInt();

        int sum=a+b;
        int substrct=a-b;
        int multi=a*b;
        int div=a/b;
        int modulus=a%b;

        System.out.println("Sum of a + b is : " + sum);
        System.out.println("Substraction of a - b is :" + substrct);
        System.out.println("Multiplication of a * b is :" + multi);
        System.out.println("Division of a / b is :" + div);
        System.out.println("Modulous of a % b is :" + modulus);
    }
}
