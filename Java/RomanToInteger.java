import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumeral = "IX"; // Change this to your desired Roman numeral

        int result = romanToInt(romanNumeral);
        System.out.println("The integer equivalent of " + romanNumeral + " is: " + result);
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentNum = romanMap.get(s.charAt(i));
            int nextNum = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

            if (currentNum < nextNum) {
                result += nextNum - currentNum;
                i++; // Skip the next character since it has been considered
            } else {
                result += currentNum;
            }
        }

        return result;
    }
}
