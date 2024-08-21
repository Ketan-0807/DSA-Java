public class ArrayEx {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 6, 7, 8};
        System.out.println("The largest element in the array is - " + Searchelement(arr1));
        System.out.println("The second largest element in the array is - " + findSecondLargestelement(arr1));
      
    }

    static int Searchelement(int arr[]) {
        int ele = arr[0]; 
        for (int i = 1; i < arr.length; i++) { 
            if (arr[i] > ele) {
                ele = arr[i]; 
            }
            

        }
        return ele;
       
    } 

    static int findSecondLargestelement(int arr[]) {
        int large = arr[1];
        int secondLargest = arr[2];
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] > large) {
                secondLargest = large;
                large = arr[i]; 
            } else if (arr[i] > secondLargest && arr[i] != large) {
                secondLargest = arr[i]; 
            }
        }
        return secondLargest;
    }

}
