//Program to count no.of elements in the array
public class countEx {
    public static int extractdigit(int n){
    int counter=0;
    while(n>0){
        counter=counter+1;
        n=n/10;

    }
    return counter;
    }
    public static void main(String[] args) {
        int N= 7789;
        int digits=extractdigit(N);
        System.out.println("no. of digits are : "+digits);
       
        
    }
}
