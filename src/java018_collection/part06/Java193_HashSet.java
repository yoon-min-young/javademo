package java018_collection.part06;

import java.util.HashSet;

public class Java193_HashSet {

	public static void main(String[] args) {
		
		//HashSet :  중복허영안되고, 순서 유지 안된다.
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		
		for(int it : set)
			System.out.println(it);
	}//end main()

}//end class
