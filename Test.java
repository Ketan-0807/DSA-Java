import java.io.*;
import java.util.Arrays;
public class Test {
    static private void getElements(int arr[], int n){

    

if(n == 0 || n == 1 ){
    System.out.print("-1");
    System.out.print("");
    System.out.print("-1");
    System.out.print("\n");

    
}
    Arrays.sort(arr);
  
    int small = arr[1];
    int secondlargest = arr[n-2];
    System.out.println("The second element of the array is : "+small);
    System.out.println("the second largest element of the array is : "+secondlargest);

    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,45,6,7};
        int n = arr.length;
        getElements(arr,n );
    }
}