import java.util.*;

public class TestGroupAnagram {
	
	/** 
     * Solution - O(n * k log k) time complexity
     * 6ms in Leetcode
     */
	public static void main(String[] args) {
		// Input
		String[] inputStrings = { "act", "pots", "tops", "cat", "stop", "hat" };
		Map<String, List<String>> map = new HashMap<>();
 		for (String s : inputStrings) {
			char[] arr1 = s.toCharArray();
			Arrays.sort(arr1);
			
			String key = new String(arr1);
//			System.out.println(arr1);
			
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
		}
 		System.out.println(map.values());
	}
}
