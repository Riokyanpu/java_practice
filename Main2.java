import java.util.*; //データを受け取る機能

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //データを受け取る機能を割り当てる
        String text = scan.next(); //next持っている入力データ読み込むメソットを呼び出す
        System.out.println("Hello" +text);
    }
}
