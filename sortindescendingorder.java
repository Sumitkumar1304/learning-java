import java.util.*;

//2️⃣ Bubble Sort in Descending Order
//
//👉 Input: {7, 2, 9, 1}
//👉 Output: {9, 7, 2, 1}
public class sortindescendingorder {

    public static void main(String args[]){

        int arr[] = {7, 2, 9, 1};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){

                if( arr[j] < arr[j+1]){
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
