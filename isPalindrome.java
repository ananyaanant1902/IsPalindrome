
public class isPalindrome {
    public static  boolean isPalindrome(String string) {
        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder string_correct = new StringBuilder(string.length());
        String lowercase = string.toLowerCase();
        for (int i = 0; i < lowercase.length(); i++) {
            char c = lowercase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                string_correct.append(c);
                stack.push(c);
            }
        }
        StringBuilder reversed_string = new StringBuilder(stack.size());
        while (!stack.isEmpty()) {
            reversed_string.append(stack.pop());
        }
        return string_correct.toString().equals(reversed_string.toString());
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("ANANYA AYNANA"));
        System.out.println(isPalindrome("I dod, dod I?"));
        System.out.println(isPalindrome("RaceCaR"));
        System.out.println(isPalindrome("RaceCaaaaR"));
    }
}
