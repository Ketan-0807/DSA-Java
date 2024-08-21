public class reverseNum {
    public static int reveresed (int Num){
        Num=123;
        int Revnum=0;
        while(Num>0){
            int lastdigit = Num % 10;
            Revnum = (Revnum * 10 ) + lastdigit;
            Num = Num / 10;
        }
        return Revnum;
       
    }
    public static void main(String[] args) {
        System.out.println(reveresed(1234));
    }
    
}
