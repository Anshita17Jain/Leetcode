class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        // If target is greater than or equal to the last letter, wrap around.
        if (target >= letters[right]) {
            return letters[left];
        }
        // Binary search
        while (left <= right) {
            int mid = (left + right) / 2;  
            // If the middle letter is greater than the target, search left half
            if (letters[mid] > target) {
                right = mid - 1;
            } else { // Otherwise search right half
                left = mid + 1;
            }
        }
        // After the loop, left will be pointing at the smallest letter greater than target
        return letters[left];
    }
}
