package dec12AssgLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertInLinkedList {
	public static void main(String[] args) {
		List<String>r=new ArrayList<String>();
		r.add("Rose");      //0
		r.add("Sunflower");  //1
		r.add("Lily");        //2"Tulip"
		r.add("Daisy");       //3
		r.add("Marigold");     //4
		System.out.println(r);
		r.add(2,"Tulip");
		System.out.println("\n Print:"+r);
		
	}

}
