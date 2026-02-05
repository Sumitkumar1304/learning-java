import java.util.*;

public class selectionsort{
    public static void main(String args[]){
        System.out.println("Perform selection sort on given array : ");

        int arr[] = {4, 6, 2, 99, 67, 88, 45, 1, 5};

        int n = arr.length;

        for(int i = 0; i<n-1; i++){
            int smallest = i;

            for(int j = i + 1; j<n; j++){
                if(arr[j] < arr[smallest]){
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i] = temp;
        }

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}