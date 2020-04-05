import java.util.*;

public class HashMaps {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("number", 1 );
		map.put("text", new String("hola"));
		map.put("decimal", 5.7 );
		
		System.out.println(map.get("text"));
		
		if (!map.containsKey("byte")) {
			System.out.println("There are not bytes here!");
		}
		
		System.out.println(map.entrySet());
		System.out.println(map.keySet ());
	}
}
