package dsa;

import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String str : strs) {
            String key = generateKey(str);
            List<String> anagramList = anagrams.getOrDefault(key, new ArrayList<>());
            anagramList.add(str);
            anagrams.put(key, anagramList);
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> values : anagrams.values()) {
            result.add(values);
        }
        return result;
    }
    private String generateKey(String str) {
        int[] arr = new int[26];
        for (int i=0; i<str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0; i< 26; i++) {
            sb.append(arr[i]);
            sb.append((char) (i+'a'));
        }
        return sb.toString();
    }
}
