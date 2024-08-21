/**
 * ptn3
 */
public class ptn3 {

    public static void Print(int N) {
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
        }
        System.out.println();
    }
}
public static void main(String[] args) {
    Print(5);
}
}