import java.util.*;
//largest element in the array
public class array1 {
    public static void main(String[] args) {
        int arr1 [] = {1,23,5,6};
        System.out.println("The largest element in the array : "+ sort(arr1));

        int arr2 [] = {31,23,52,6};
        System.out.println("The largest element in the array : "+ sort(arr2));


    }
    static int sort(int arr[]){
     Arrays.sort(arr);
     return arr[arr.length-1];
    }
}
