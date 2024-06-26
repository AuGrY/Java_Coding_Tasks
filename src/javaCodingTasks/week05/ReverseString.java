package javaCodingTasks.week05;

public class ReverseString {

    public static String reverse(String input) {
        // to reverse the string with Stringbuilder
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {

        String input = "ABCD";
        System.out.println("Reversed string: " + reverse(input)); // Output: DCBA
    }
}