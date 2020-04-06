import java.nio.file.*;
import java.util.*;

public class ShowIOException {
	public static void main(String[] args) {
		// declare a list that will contain all of the files
		// inside of the readme.txt file
		List<String> lines = Collections.emptyList ();
		
		// provoke an exception
		lines = Files.readAllLines(Paths.get("readme.txt"));
		
		// you will never see this print
		Iterator<String> iterator = lines.iterator();
		while (iterator.hasNext())
			System.out.println(iterator.next());
	}
}
