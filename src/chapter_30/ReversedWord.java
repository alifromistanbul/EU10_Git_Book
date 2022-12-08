package chapter_30;

import java.util.Scanner;

public class ReversedWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String reversed = "";

        for(int i=word.length()-1; i>=0; i--){
            char ch = word.charAt(i);
            reversed += ch;
        }
        System.out.println(reversed);

    }
}
