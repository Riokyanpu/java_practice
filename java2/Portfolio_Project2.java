public class Portfolio_Project2 {
    public static void main(String[] args) {
      runChapter1();  // Chapter 1のメソッド呼び出し
      runChapter2();  // Chapter 2のメソッド呼び出し
      runChapter3();  // Chapter 3のメソッド呼び出し
      runChapter4();  // Chapter 4のメソッド呼び出し
      runChapter5();  // Chapter 5のメソッド呼び出し

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
//04:おみくじを作ってみよ
    public static void runChapter4()  {
		int omikuji = (int)(Math.random() * 100 + 1);  // randomメソッドについては次のチャプターで説明します
		if (omikuji  >=30 ) {
			System.out.println("omikujiの中身は" + omikuji + "なので大吉");
		} else {
			System.out.println("omikujiの中身は" + omikuji + "なので大凶");
		}
    }
//05:RPGのクリティカルヒットを再現
// RPGのクリティカルヒットを再現
// 比較演算子 == > < >= <= !=


// スライムと戦っている。
// 1から10のサイコロをふって、
// 6未満：サイコロの目だけダメージを与えたと表示。
// 6以上：クリティカルヒットとして、100のダメージを与えたと表示。
// さらに、1から2のサイコロをふって、
// 1：追加攻撃として、10のダメージを与えたと表示。
// 2：追加攻撃に失敗したと表示。
    public static void runChapter5()  {
        int hit = (int)(Math.random() * 10 + 1);
        if (hit < 6) {
            System.out.println("スライムに" + hit + "のダメージを与えた");
        } else {
            System.out.println("クリティカルヒット!スライムに、100のダメージを与えた!!");
        }

        int add = (int)(Math.random() * 2 + 1); // この行を修正して1から2のサイコロになるようにする
        System.out.println("追加のサイコロは、" + add);
        if (add == 1) { // この行の条件式を修正
            System.out.println("追加攻撃!スライムに、10のダメージを与えた!!!");
        } else {
            System.out.println("追加攻撃に失敗!");
        }
    }
}
