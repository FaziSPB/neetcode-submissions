class Solution {
    public int lengthOfLongestSubstring(String s) {
        SequencedSet<Character> set = new LinkedHashSet<>();
        int max = 0;
        for (int i = 0; i<s.length(); i++) {
            char r = s.charAt(i);
            while (set.contains(r)) set.removeFirst();
            set.add(r) ;
            if (max < set.size()) max = set.size(); 
        }
        return max;
    }
}
