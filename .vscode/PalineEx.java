class PalineEx{
    public static void main(String[] args) {
        int remin,temp;
        int sum = 0;
        int n= 454;
        temp=n;

        while(n>0){
            remin=n%10;
            sum=(sum*10)+remin;
            n=n/10;

        }

        if(temp==sum){
            System.out.println("Palinedrome num");
        }else{
            System.out.println("not a palinedrome");
        }
}

}