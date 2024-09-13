public class PrintName {
    static void Name(int i,int n){
     if(i>n) return;
        System.out.println("Ketan");
        Name(i+1,n);
        // System.err.println();
    
   
    }
    public static void main(String[] args) {
        int n =5;
        Name(1,n);
    } 
}
