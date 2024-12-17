//02:Javaでプログラムを書いてみよう
public class Part1_Basics {
  public static void main(String[] args) { // メインメソッドを定義します。Javaプログラムの開始点です。
      System.out.println("hollo wriod");   // "hollo wriod" という文字列をコンソールに出力します。
      
  
//03 コメントを入力する
      System.out.println("hello world1"); //文字を表示
      System.out.println("hello world2"); 
      System.out.println("hello world3"); 
      /*System.out.println("hello world4"); 
      System.out.println("hello world5");*/ //複数の行をコメントアウトするときは、コメント行の先頭に「/*」を、末尾に「*/」を記述

//04:HTMLを表示してみよう
      System.out.println("<h1>hello world</h1>");
      System.out.println("<p>世界の皆さん、");
      System.out.println("<b>こんにちは</b></p>");
//テキストで改行なしの場合		
      System.out.print("<h1>hello world</h1>");
      System.out.print("<p>世界の皆さん、");
      System.out.print("<b>こんにちは</b></p>");
//HTMLとして出力してみよう
    System.out.println("<p>勇者は、荒野を歩いていた</p>");
//モンスターを太字にしてみよう
      System.out.println("<b>モンスター</b>があらわれた");
//05:変数を使えるようになろう
      String player = "勇者"; // 文字列データの変数
      System.out.println(player + "は、荒野を歩いていた");
      System.out.println(player + "は、モンスターと戦った");
      System.out.println(player + "は、モンスターをたおした");

//06: サイコロを作ろう
      double rand = Math.random() * 100 + 1; // 1から100までの乱数を生成
      int number = (int)rand; // 乱数を整数に変換
      System.out.println("スライムが" + number + "匹あらわれた");

//07: 演算子で計算してみよう
      int number2 = (100 + 3) * 5; // 計算の結果を格納
      System.out.println(number2);

//08:値段を計算してみよう
      int apple_price = (int)(Math.random() * 3 + 1) * 100; // リンゴの単価
	    int apple_num = (int)(Math.random() * 10 + 1); //リンゴを買う数
	    System.out.println("りんごの単価" + apple_price + "円");
	    System.out.println("りんごを買う数" + apple_num + "個");
	    
	    int total = apple_price * apple_num;
	    System.out.println("合計金額 :" + total + "円");

//09:データの型を覚えよう
      int number1 = 100 + 20;  // 数値用に名前を変更
      String text = "halo " + "man";  // 文字列
      System.out.println(number1);  // number1を使用
      System.out.println(text);
      System.out.println(number1 * 50);
      System.out.println(text + number1);


    }

}

//Project1:chapter1~4