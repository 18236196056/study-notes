import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;


public class TestCollections {
	public static void main(String[] args) {
		List list = new ArrayList();
		List list_1 = new ArrayList(200);
 		Collections.addAll(list, "Apple","Oracle","HuaWei");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(Collections.binarySearch(list, "HuaWei"));
//		Collections.fill(list,"hhhh");
		System.out.println(list);
		
//		Collections.copy(list_1, list);
//		System.out.println(list_1);
	}
	
}
