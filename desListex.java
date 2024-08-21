import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class desListex {
    public static void main(String[] args) {
  
        List<String> Sen = new ArrayList<>();
        
  
        Sen.add("How are you");
        Sen.add("I'm here");
        Sen.add("Why so serious");
        
        Collections.sort(Sen,Collections.reverseOrder());
        System.out.println("arraning a list in desecending order");
        
        for (String sentence : Sen) {
            System.out.println(sentence);
        }
    }
}


