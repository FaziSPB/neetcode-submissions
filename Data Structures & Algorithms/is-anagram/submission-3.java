class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length()) {
            char[] arr1 = s.toCharArray();
            char[] arr2 = t.toCharArray();
            HashMap<Character, Integer> h1 = new HashMap<Character,Integer>();
            HashMap<Character, Integer> h2 = new HashMap<Character,Integer>();
            for (int i = 0; i < arr1.length; i++) {
            if (h1.get(arr1[i]) == null) {
                h1.put(arr1[i], 1);
            } else {
                Integer c = (int) h1.get(arr1[i]);
                h1.put(arr1[i], ++c);
            }
            }
            for (int j = 0; j < arr2.length; j++) {
            if (h2.get(arr2[j]) == null)
                h2.put(arr2[j], 1);
            else {
                Integer d = (int) h2.get(arr2[j]);
                h2.put(arr2[j], ++d);
                }
            }
            if (h1.equals(h2)) return true;
            else return false;
        }
        return false;
    }
}
