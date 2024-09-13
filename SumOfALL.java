public class SumOfALL{
    public static void solve(int i, int n){
        if(i < 1 ) return;
        System.out.println(i);

        solve(i-1 , n);
    }
    public static void main(String[] args) {
        int n=4;
        solve(n, n);
        
    }
}