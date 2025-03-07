package DSA.TwoPointers.ValidPalindrome;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(new Solution().isPalindrome(s));
    }
}

class Solution {
    // Time: O(n/2)
    // Space: O(1)

    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return true;
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
