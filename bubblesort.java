import java.util.*;

public class bubblesort{
    public static void main(String args[]){
        System.out.println("Performing bubbleshort on given array :");

        int arr[]  = { 5, 3, 77, 33, 55, 88, 34, 2,56, 1};
        int n=arr.length;

        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}