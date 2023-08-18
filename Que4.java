// Write a java program to remove the particular character from the String

public class Que4 {

    public static String removeCharAt(String s , int a){
        return s.substring(0,a)+s.substring(a+1);
    }
    public static void main(String[]args){
        String str = "java is programming language";
        System.out.println(removeCharAt(str, 1));
    }
}
