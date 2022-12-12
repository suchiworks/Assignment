package dec12AssgLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SuffleLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>r=new ArrayList<String>();
		r.add("Rose");
		r.add("Sunflower");
		r.add("Lily");
		r.add("Daisy");
		r.add("Marigold");
		System.out.println(r);
		Collections.shuffle(r,new Random(1));
		System.out.println("\n Print:"+r);
	}

}
