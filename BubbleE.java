public class BubbleE {
    public static void main(String[] args, int n) {
        int arr[]  ={2,8,9,1,4};

        for(int i=-1;i>=0;i--){
            for(int j=1; j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
       
        for(int i=0;i < n ;i++)
        System.out.print(arr[i]+"");
    }
}
