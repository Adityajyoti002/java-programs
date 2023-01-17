
class Palindrome {
        public static boolean isPalindrome(String s) {
            if (s.length() == 0 || s.length() == 1) {
                return true;
            }
            if (s.charAt(0) == s.charAt(s.length() - 1)) {
                return isPalindrome(s.substring(1, s.length() - 1));
            }
            return false;
        }

        public static void main(String[] args) {
            String s = "racecar";
            if (isPalindrome(s)) {
                System.out.println(s + " is a palindrome.");
            } else {
                System.out.println(s + " is not a palindrome.");
            }
        }
    }

