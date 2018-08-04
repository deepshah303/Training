import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Jack", "Jill");
		map.put("scott", "tiger");
		map.put("duke", "java");
		map.put("jack", "rose");

		for (String key : map.keySet())
			System.out.println(key + ": " + map.get(key));

	}

}
