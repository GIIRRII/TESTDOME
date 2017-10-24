public class Palindrome {
    public static boolean isPalindrome(String word) {
        String str = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(str);
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
}