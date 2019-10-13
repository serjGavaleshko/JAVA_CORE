package Homework_6;


import java.util.Scanner;

public class PalindIdent {
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string to check palindrome: ");
        String word1 = in.next();
        in.close();

        word1 = word1.toLowerCase();
        char[] chars = word1.toCharArray();
        int p = 0;
        char[] charsret = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            charsret[i] = chars[chars.length - 1 - i];
        }
        for (int j = 0; j < chars.length; j++) {
            p = p + 1;
            if (chars[j] != charsret[j]) {
                System.out.println("Your string is NOT palindrome!");
                break;
            }
        }
        if (p == chars.length) {
            System.out.println("Your string is palindrome!");
        }
    }

}

