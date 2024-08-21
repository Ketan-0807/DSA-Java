public class Demo {
 private int a ;
      class Inner{
        void print_value(){
            System.out.println(a);
        }

 }
 public static void main(String[] args) {
   Demo de= new Demo();
   de.a=0;
   Demo.Inner in= de.new Inner();
   //de.new Inner().print_value();
    in.print_value();
 }   
}

