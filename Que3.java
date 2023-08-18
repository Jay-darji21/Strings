// Write a java program to print String in upper case to lower case and vice versa

public class Que3 {
    public static void main(String[]args){
        String str = "Jay darji";
        String str1 = "";

        for(int i = 0 ; i<=str.length()-1 ; i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                str1 = str1 + (char)(str.charAt(i)-32);
            }
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                str1 = str1 + (char)(str.charAt(i)+32);
            }
        }
        System.out.println(str1);
    }
}
