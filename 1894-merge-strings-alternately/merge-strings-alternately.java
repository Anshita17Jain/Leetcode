class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merged = new StringBuilder();
        int i = 0;
        int n1 = word1.length();
        int n2 = word2.length();

        // Merge characters alternately
        while (i < n1 && i < n2) {
            merged.append(word1.charAt(i));
            merged.append(word2.charAt(i));
            i++;
        }
        // Append remaining characters from the longer string
        if (i < n1) {
            merged.append(word1.substring(i));
        } else if (i < n2) {
            merged.append(word2.substring(i));
        }
        return merged.toString();
    }
}
