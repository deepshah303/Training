import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("IBM");

		System.out.println("-- Iterating over vector using for each");
		for (String elen : v)
			System.out.println(elen);

		System.out.println("-- Iterating over vector using iterator");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		LinkedList<String> list = new LinkedList<>();
		list.add("Tesla");
		list.add("Apache");
		list.add("Apple");

		v.addAll(list); // Merging list into vector
		System.out.println("-- iterating over updated vector using for each");
		for (String elen : v)
			System.out.println(elen);

		HashSet<String> set = new HashSet<>(v);
		System.out.println("-- Iterating over hashset using for each");
		for (String elen : set)
			System.out.println(elen);

		// Converting Set in TreeSet
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("-- Iterating over treeset using for each");
		for (String elen : tree)
			System.out.println(elen);

		System.out.println("-- Reverse order");
		for (String elen : tree.descendingSet())
			System.out.println(elen);

		System.out.println("-- Iterating over TreeSet using Java 8 forEach()");
		// New way to Iterate from Java 8
		tree.forEach(System.out::println);

		String week[] = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		List<String> days = Arrays.asList(week);
		days.forEach(System.out::println);

	}

}
