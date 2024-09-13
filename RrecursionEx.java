class RecursionEx{
    static int counter=0;
    static void print(){
     if(counter==4) return;
       System.out.println(counter);
        counter = counter+1;
        print();
     
    }
    public static void main(String[] args) {
        print();
    }
}