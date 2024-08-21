import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class crudEx {
    public static void main(String[] args) {
        List <String> li = new ArrayList<>();
        li.add("one");
        li.add("two");
        li.add("three");
        li.add("four");
        System.out.println("these are the added items in the list is : "+li.get(3));
        System.out.println("these are elements : "+li);

        li.set(1,"six" );
        System.out.println("updated element is : "+li.get(1));

        li.remove(3);
        System.out.println("removed element is : "+li.get(2));
    }
}
