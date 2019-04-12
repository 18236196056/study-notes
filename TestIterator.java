import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class TestIterator {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		Collections.addAll(list, "Apple","Oracle","HuaWei");
		System.out.println(list);
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			String str = (String)(it.next());
			if(str.equals("Oracle"))
				it.remove();
		}
		System.out.println(list);
	}

}
