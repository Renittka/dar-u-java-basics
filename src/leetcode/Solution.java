package leetcode;

public class Solution {

    public static int countAsterisks(String s) {
        int count = 0;
        boolean inPair = false;
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (c == '|') {
               inPair = !inPair;
            } else if (c == '*' && !inPair) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "yo|uar|e**|b|e***au|tifu|l";
        System.out.println(countAsterisks(s));
    }
}
