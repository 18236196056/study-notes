import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class TestList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Apple");
		list.add("Sun");
		list.add("Oracle");
		list.add("Apple");
		list.add(1,"HuaWei");
//		list.add(10);
		
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		list.set(1, "Cisco");
		
		System.out.println("--->" + list.indexOf("Apple"));
		
		list.remove(4);
		System.out.println(list.remove("Oracle"));
		
		
		
//		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		System.out.println(list);
		
		for(String str : list){
			System.out.println(str.toString());
		}
	}

}
