public class Main {
    public static void main(String[] args) {
        BrowserHistory first = new BrowserHistory("leetcode.com");

        first.visit("google.com");
        first.visit("facebook.com");
        first.visit("youtube.com");
        first.back(1);
        first.back(1);
        first.forward(1);
        first.visit("linkedin.com");
        first.forward(2);
        first.back(2);
        first.back(7);
    }
}