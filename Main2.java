import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  //データを受け取る機能を割り当てる
        // 1つ目の入力を受け取る
        String text1 = scan.next(); //scan.nextが持っている入力データを呼び出す
        // 2つ目の入力を受け取る
        String text2 = scan.next();
        // 入力された2つのテキストを表示
        System.out.println(text1);
        System.out.println(text2);
        int number = scan.nextInt();
        System.out.println(number * 10);
        System.out.println("お小遣い" + number + "円");
    }
}