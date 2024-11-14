public class Portfolio_Project1 {

  public static void main(String[] args) {
      runChapter2();  // Chapter 2のメソッド呼び出し
      runChapter3();  // Chapter 3のメソッド呼び出し
      runChapter4();  // Chapter 4のメソッド呼び出し
      runChapter5();  // Chapter 5のメソッド呼び出し
      runChapter6();  // Chapter 6のメソッド呼び出し
      runChapter7();  // Chapter 7のメソッド呼び出し
  }

  //02: Javaでプログラムを書いてみよう
  public static void runChapter2() {
      System.out.println("hollo wriod");   // "hollo wriod" という文字列をコンソールに出力します。
  }

  //03: コメントを入力する
  public static void runChapter3() {
      System.out.println("hello world1"); // 文字を表示
      System.out.println("hello world2"); 
      System.out.println("hello world3"); 
      /* System.out.println("hello world4"); 
         System.out.println("hello world5"); */ // 複数行コメントの例
  }

  //04: HTMLを表示してみよう
  public static void runChapter4() {
      System.out.println("<h1>hello world</h1>");
      System.out.println("<p>世界の皆さん、");
      System.out.println("<b>こんにちは</b></p>");
      
      // テキストで改行なしの場合
      System.out.print("<h1>hello world</h1>");
      System.out.print("<p>世界の皆さん、");
      System.out.print("<b>こんにちは</b></p>");
      
      // HTMLとして出力してみよう
      System.out.println("<p>勇者は、荒野を歩いていた</p>");
      
      // モンスターを太字にしてみよう
      System.out.println("<b>モンスター</b>があらわれた");
  }

  //05: 変数を使えるようになろう
  public static void runChapter5() {
      String player = "勇者"; // 文字列データの変数
      System.out.println(player + "は、荒野を歩いていた");
      System.out.println(player + "は、モンスターと戦った");
      System.out.println(player + "は、モンスターをたおした");
  }

  //06: サイコロを作ろう
  public static void runChapter6() {
      double rand = Math.random() * 100 + 1; // 1から100までの乱数を生成
      int number = (int)rand; // 乱数を整数に変換
      System.out.println("スライムが" + number + "匹あらわれた");
  }

  //07: 演算子で計算してみよう
  public static void runChapter7() {
      int number = (100 + 3) * 5; // 計算の結果を格納
      System.out.println(number);
  }
}
