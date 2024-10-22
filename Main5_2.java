import java.util.*;

public class Main5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //データを受け取る機能を割り当てる
        String greeting = scan.next();
        if (greeting.equals("Hello")) {
            System.out.println("こんにちは");
        } else {
            System.out.println("さようなら");
        }
        
    }
}

