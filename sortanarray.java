import java.util.*;


//1️⃣ Sort an array using Bubble Sort
//
//👉 Input: {4, 3, 1, 5, 2}
//👉 Output: {1, 2, 3, 4, 5}
//
//Task:
//
//Implement Bubble Sort
//
//Print the sorted array

public class sortanarray {

    public static void main(String args[]){



        // Bubble sort
        int arr[] = {4, 3, 1, 5,2};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}
