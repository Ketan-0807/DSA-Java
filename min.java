

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class min {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> minh=new PriorityQueue<>();
		minh.add(45);
		minh.add(25);
		minh.add(65);
		minh.add(23);
		minh.add(53);
		minh.add(3);

		System.out.println("minimum: "+minh.poll()+" "+minh.poll());
		PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
		maxh.add(56);
		maxh.add(66);
		maxh.add(21);
		maxh.add(54);
		maxh.add(4);
		maxh.add(84);

		System.out.println("max: "+maxh.poll()+" "+maxh.poll());
		

	}

}