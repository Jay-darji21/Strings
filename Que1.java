// Write a program to print the reverse string without use of inbuilt method

public class Que1{
    public static void main(String[]args){
        String str = "Java is a programming language";
        String reverse = "";
        

        for(int i = str.length()-1 ; i>=0 ; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
    }
}