package dec12AssgLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElements {
	public static void main(String[] args) {
		List<String>r=new ArrayList<String>();
		r.add("Rose");      //Daisy //0
		r.add("Sunflower");        //1
		r.add("Lily");               //2
		r.add("Daisy");       //Rose   //3
		r.add("Marigold");    //4
		System.out.println(r);
		Collections.swap(r,0,3);
		System.out.println("\n Print:"+r);
		
	}

}
