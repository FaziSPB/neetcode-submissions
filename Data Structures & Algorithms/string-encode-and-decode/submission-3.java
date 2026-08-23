class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
        sb.append(str.length()).append("#").append(str);
    }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;

        while (i < str.length()) { 
        int hashIndex = str.indexOf('#', i);
        int length = Integer.parseInt(str.substring(i, hashIndex));
        int startWord = hashIndex + 1;
        String word = str.substring(startWord, startWord + length);
        res.add(word);
        i = startWord + length;}
        
        return res;   
    }
}
