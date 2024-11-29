//条件に一致したら処理を実行する

import java.util.*; //データを受け取る機能簡単に

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //データを受け取る機能を割り当てる
        int number = scan.nextInt();
        System.out.println(number);

        if (number == 10)  {
          System.out.println("Welcom");
      }
    }
}


