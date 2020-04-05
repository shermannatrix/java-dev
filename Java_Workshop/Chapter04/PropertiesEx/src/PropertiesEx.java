import java.util.*;

public class PropertiesEx {
	public static void main(String[] args) {
		Properties properties = new Properties();
		Set setOfKeys;
		String key;
		
		properties.put("OS", "Windows");
		properties.put("version","10");
		properties.put("language", "English (UK)");
		
		// iterate through the map
		/*setOfKeys = properties.keySet();
		Iterator iterator = setOfKeys.iterator();
		
		while (iterator.hasNext()) {
			key = (String) iterator.next();
			System.out.println(key + " = " + properties.getProperty(key));
		}*/
		
		// using the list() method.
		properties.list(System.out);
		
		// We can also use enumeration
		/*Enumeration enumeration = properties.propertyNames ();
		
		while (enumeration.hasMoreElements ()) {
			System.out.println(enumeration.nextElement());
		}*/
		
		System.out.println();
		
		String oldValue = (String) properties.setProperty("language", "German");
		
		if (oldValue != null) {
			System.out.println("modified the language property");
		}
		
		properties.list(System.out);
		
		System.out.println();
		
		// looking for URL that's not in list
//		String value = properties.getProperty("keyboard layout", "not found");
//		System.out.println("keyboard layout = " + value);
	}
}
