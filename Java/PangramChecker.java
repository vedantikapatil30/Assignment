public class PangramChecker {
    public static void main(String[] args) {
        String input = "abcdefgh";
        boolean isPangram = checkPangram(input.toLowerCase());
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    private static boolean checkPangram(String str) {
        boolean[] visited = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                if (!visited[str.charAt(i) - 'a']) {
                    visited[str.charAt(i) - 'a'] = true;
                    count++;
                }
            }

            if (count == 26) {
                return true;
            }
        }

        return false;
    }
}
