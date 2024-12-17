public class Portfolio_Project2 {
    public static void main(String[] args) {
      runChapter1();  // Chapter 1のメソッド呼び出し
      runChapter2();  // Chapter 2のメソッド呼び出し
      runChapter3();  // Chapter 3のメソッド呼び出し

    }
     
      public static void runChapter1()  {
        int number =(int)(Math.random() * 5 + 1);
        System.out.println("あなたの順位は" + number + "位です");
        if (number == 1) {
            System.out.println("おめでとう！");
        } else {
            System.out.println("あと少し！");
        }
      } 
//02:複数の条件を組み合わせてみよう
      public static void runChapter2()  {
        int number = (int)(Math.random() * 5 + 1);
        System.out.println("あなたの順位は" + number + "位です");
        if (number == 1) {
            System.out.println("おめでとう！");
        } else if (number ==2) {
            System.out.println("あと少し！");
        } else {
            System.out.println("よくがんばったね");
        }
      }
//03:比較演算子で条件分岐してみよう
    public static void runChapter3()  {
		int place = (int)(Math.random() * 12+ 1);
		System.out.print(place + "位");
		// ここにif文を追加する
		if (place < 7) {
			System.out.println("入賞");
		} else {
			System.out.println("入賞圏外");
		}
    }
}
