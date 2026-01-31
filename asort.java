import java.util.*;

public class asort {
    public static void main(String args[]){

        int arr[] = {5,3, 9, 6, 1, 7};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j =0; j < n - i - 1; j++){

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        for(int x: arr){
            System.out.print(x + " ");
        }
 System.out.println();
        for(int i = 0; i < n - 1; i++){
            for(int j =0; j < n - i - 1; j++){

                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

        for(int y : arr){
            System.out.print(y + " ");
        }
    }
}
