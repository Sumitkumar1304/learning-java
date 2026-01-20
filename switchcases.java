import java.util.*;

public class switchcases {
    public static void main(String args[]){

        System.out.println("1. Pizza 199 \n2. Burger 99 \n3. Pasta 149 \n4. Hot coffee 49 \n5. Cold coffee 89");

        System.out.println("Choose a no. Between 1 to 5 which you want to order :");

        Scanner sc=new Scanner(System.in);
        int no = sc.nextInt();

        switch (no){
            case 1: System.out.println("Thank You : You order is confirm ,\nWithin 5 minutes Your Delecious Pizz will on the your table ");
            break;

            case 2: System.out.println("Thank You : You order is confirm ,\nWithin 5 minutes Your Delecious Burger will on the your table ");
            break;

            case 3: System.out.println("Thank You : You order is confirm ,\nWithin 5 minutes Your Delecious Pasta will on the your table ");
            break;

            case 4: System.out.println("Thank You : You order is confirm ,\nWithin 5 minutes Your Delecious Hot Coffee will on the your table ");
            break;

            case 5: System.out.println("Thank You : You order is confirm ,\nWithin 5 minutes Your Delecious Cold Coffee will on the your table ");
            break;

            default: System.out.println("You Entered wrong no. ");

        }
    }
}
