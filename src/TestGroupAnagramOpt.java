import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGroupAnagramOpt {

	public static void main(String[] args) {
		String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
		Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (int i = 0; i < s.length(); i++) {
                count[s.charAt(i) - 'a']++;
            }
            StringBuilder key = new StringBuilder(26 * 2);
            for (int c : count) {
                key.append('#').append(c);
            }
            map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(s);
        }
        System.out.println(map.values());
//        System.out.println(map.keySet());
	}
}
