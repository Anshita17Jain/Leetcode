class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentValue = valueOfRoman(s.charAt(i));

            // Check if the next character has a larger value (indicating subtraction)
            if (i < length - 1 && currentValue < valueOfRoman(s.charAt(i + 1))) {
                total -= currentValue;  // Subtract if smaller than the next character
            } else {
                total += currentValue;  // Otherwise, add the current value
            }
        }

        return total;
    }

    // Method to return the integer value for a given Roman numeral
    private int valueOfRoman(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0; // Invalid character handling (optional)
        }
    }
}
