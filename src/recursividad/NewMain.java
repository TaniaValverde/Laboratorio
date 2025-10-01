package recursividad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author pablonoguera
 */
public class NewMain {

    public static void main(String[] args) {
        String word = "Anitalava  ghla  tina";
        boolean flag = palindrome(word, 0, word.length() - 1);
        System.out.println("flag = " + flag);
        
    }

    private static boolean palindrome(String word, int start, int end) {

        if (word.isEmpty()) {
            return true;
        }
        if (start == end) {
            return true;
        }

        if (word.charAt(start) == ' ') {
            return palindrome(word, start + 1, end);
        }
        if (word.charAt(end) == ' ') {
            return palindrome(word, start, end - 1);
        }
        
        String letter1 = String.valueOf(
                word.charAt(start)).toUpperCase();
        String letter2 = String.valueOf(
                word.charAt(end)).toUpperCase();                                

        if (letter1.compareTo(letter2) == 0) {
            return palindrome(word, start + 1, end - 1);
        } else {
            return false;
        }

    }

}
