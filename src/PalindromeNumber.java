public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -10;

        isPalindrome(x);
    }

    public static boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        int front = 0;
        int back = value.length() - 1;

        if(front == back){
            return true;
        }
        while (front < back){
            if(value.charAt(front) != value.charAt(back)){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
