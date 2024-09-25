class Solution {
    public int romanToInt(String s) {
        // Step 1: Create a map to store Roman numerals and their values
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        // Step 2: Initialize total sum and length of the string
        int total = 0; // This will hold the final integer value
        int length = s.length(); // Get the length of the Roman numeral string

        // Step 3: Traverse the Roman numeral string
        for (int i = 0; i < length; i++) {
            int currentValue = romanMap.get(s.charAt(i)); // Get the value of the current character

            // Step 4: If this is not the last character and the current value is less than the next value
            if (i < length - 1 && currentValue < romanMap.get(s.charAt(i + 1))) {
                // Subtract the current value
                total -= currentValue;
            } else {
                // Add the current value
                total += currentValue;
            }
        }

        // Step 5: Return the total integer value
        return total;
    }
}