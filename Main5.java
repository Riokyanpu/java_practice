//文字列の一致を判定する

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);
        
        if (name.equals("java")) {
            System.out.println("Welcome");
        } else if (name.equals("JAVA")) {
            System.out.println("Good morning");
        } else {
            System.out.println("Goodbye");
        }
    }
}