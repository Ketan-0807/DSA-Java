public class ConstructorsEX {
    int value;
    String name;

public ConstructorsEX(int value,String name) {
    this.name = name;
    this.value = value;
}
 public int getValue(){
    return value;
 }
 public String getName(){
    return name;
 }
 public void setValue(int value){
    this.value = value;
 }
 public void setName(String name){
    this.name= name;
 }
 public static void main(String[]args){
    ConstructorsEX obj = new ConstructorsEX(1,"Ketan");
    System.out.println(obj.getValue());
    System.out.println(obj.getName());
 }
}
