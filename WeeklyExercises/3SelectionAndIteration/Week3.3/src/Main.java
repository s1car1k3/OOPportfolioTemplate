// Java Program to Reverse a String
// Using for loop
import java.io.*;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print ("Enter the string: ");
        String s = scan.next();

        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r = ch + r;
        }

        System.out.println(r);
    }
}