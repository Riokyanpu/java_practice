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

//06:サイコロを作ろう
      double rand = Math.random() * 100 + 1;
      //System.out.println(rand);
      int number = (int)rand;
      //System.out.println(number);
      System.out.println("スライムが" + number + "匹あらわれた");
      /*double型は、小数点以下の数値を扱うことのできるデータ型です。
      int型と同様に、多くの場面で使用されています。
      型変換の例：
      (int)60.5 ：60.5というdouble型の値を、60というint型の値として取り出す。*/

//07:演算子で計算してみよう
int number = (100 + 3) * 5;
System.out.println(number);



    }

}

//Project1:chapter1~4