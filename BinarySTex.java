public class BinarySTex {
    public static int binarySearch(int[] num,int target){
        int n=num.length;
        int low=0 , high = n-1;
        while (low <=high) {
            int mid = (low + high ) /2 ;
            if (num[mid] == target) return mid;
            else if (target > num[mid]) low = mid +1;
            else high = mid -1 ;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        int ind = binarySearch(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);
    }
        
    
}
