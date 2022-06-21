package app.ex01;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "1698778-0499");
		cookies.put("phone", "1698778-0489");

		System.out.println("Contains 'Phones' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("e-Mail: " + cookies.get("emails"));
		System.out.println("Size: " + cookies.size() + "\n");
		cookies.remove("email");

		for (String key : cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}
		System.out.println("Size: " + cookies.size() + "\n");
		System.out.println("");

	}

}
