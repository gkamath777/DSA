import java.util.*;

public class TestGroupAnagram {
	public static void main(String[] args) {
		String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
		Map<String, List<String>> map = new HashMap<>();
 		for (String s : strs) {
			char[] arr1 = s.toCharArray();
			Arrays.sort(arr1);
			
			String key = new String(arr1);
			System.out.println(arr1);
			
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
		}
 		System.out.println(map.values());
	}
}
