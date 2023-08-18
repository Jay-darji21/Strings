
// Write a java program to know the wethor entered String is palindrome

import java.util.Scanner;

public class Que2 {

    public static void main(String[] args) {
        String original, reverse = "";

        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        original = sc.nextLine();
        sc.close();
        int length = original.length();
        for (int i = length- 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
            if (original.equals(reverse)) {
                System.out.println("String is palindrome");
            } else {
                System.out.println("String is not polindrome");
            }


    }
}


