package org.example;


    class Solution {
        public int lengthOfLastWord(String s) {
            String[] words = s.trim().split("\\s+");
            return words[words.length - 1].length();
        }
    }
class Main{
    static void main(String[] args) {
        Solution solution = new Solution();
        String input1 = "Hello World";
        String input2 = "   fly me   to   the moon  ";
        String input3 = "luffy is still joyboy";
        System.out.println(solution.lengthOfLastWord(input1));
        System.out.println(solution.lengthOfLastWord(input2));
        System.out.println(solution.lengthOfLastWord(input3));


    }
}