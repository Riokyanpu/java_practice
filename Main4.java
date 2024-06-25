//条件に合わせて処理を変える

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.next();
        System.out.println(text);
        int number = scan.nextInt();
        System.out.println(number);
        
        if (number == 10) {
            System.out.println("Welcome");
        } else if (number > 10) {
            System.out.println("Good morning"); //整数10以下の場合
        } else {
            System.out.println("Goodbye");
        }
    }
}
