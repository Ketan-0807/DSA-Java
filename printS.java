public class printS {
    static void check(int i,int n){
        if(i>n)return;
        System.out.println(i);
        check(i+1,n);

    }
    public static void main(String[] args) {
        int n = 10;
        check(1,n);
    }
}
