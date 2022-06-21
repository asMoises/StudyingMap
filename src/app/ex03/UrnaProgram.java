package app.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class UrnaProgram {

	public static void main(String[] args) {

		Map<String, Integer> votes = new LinkedHashMap<>();
		
		String path = "/Users/moiss/Documents/Java/files/map_urna.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {	
				String[] fields = line.split(",");
				String candidate = fields[0];
				Integer count = Integer.parseInt(fields[1]);

				if (votes.containsKey(candidate)) {
					int votesSoFar = votes.get(candidate);
					votes.put(candidate, count + votesSoFar);
				} else {
					votes.put(candidate, count);
				}
				System.out.println(line);

				line = br.readLine();
			}
			System.out.println("");
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Error: " + a.getMessage());
		}
	}
}
