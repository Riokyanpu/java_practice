public class m_2 {
//01:IF文による条件分岐
    public static void main(String[] args) {
          int number = 2;
          if (number == 1) {
                    System.out.println("ok!");//条件式が成立した時の結果
          } else {
                  System.out.println("on?");//条件式が成立しなかった時の結果
                  System.out.println("on?");
          
          int number2 =(int)(Math.random() * 3 + 1);
          if (number2 == 1) {
                  System.out.println("あなたの順位は" + number2 + "です");
                  System.out.println("おめでとう!");
          } else{
                  System.out.println("あなたの順位は" + number2 + "位です");
          } 
  // if文による条件分岐　else if
          int number3 = 2;
          if (number3 == 1) {
            System.out.println("スキ！");		// 条件式が成立したときの処理
          } else if (number3 == 2) {
            System.out.println("どちらでもない");
          } else {
            System.out.println("キライ");		// 条件式が成立しなかったときの処理
          }
  // if文による条件分岐　比較演算子
          int time = 13;
          if (time < 12) {
            System.out.println("午前中"); // 条件式が成立したときの処理
          } else if (time == 12) {
              System.out.println("正午"); 
          }  else if (time > 12) {
              System.out.println("午後"); 
          } 
 // if文による条件分岐　比較演算子 その２
          int age = (int)(Math.random() * 5 + 18);
          if (age < 20) {
                System.out.print(age + "才は飲酒不可");   
          } else if (age >= 20 ) {
                  System.out.print(age + "才は飲酒可能"); 
          } 
// if文による条件分岐　比較演算子 その3
          int place = (int)(Math.random() * 12+ 1);
          System.out.print(place + "位");
          
          if (place < 7) {
            System.out.println("入賞");
          } else if (place >= 7) {
            System.out.println("入賞圏外");
          }
// おみくじを作る
// 比較演算子  ==  >  <   >=  <=  !=
// 大吉  中吉  小吉  凶  大凶
        int omikuji = (int)(Math.random() * 10 + 1);
        System.out.println(omikuji);
        if (omikuji == 1) {
            System.out.println("大吉");
        } else if (omikuji == 2) {
            System.out.println("中吉");
        } else if (omikuji <= 4) {
            System.out.println("小吉"); // 3,4
        } else if (omikuji <= 7) {
            System.out.println("凶");   // 5,6,7
        } else {
            System.out.println("大凶"); // 8,9
        } 
// おみくじその2
        int omikuji2 = (int)(Math.random() * 100 + 1);  // randomメソッドについては次のチャプターで説明します
        if (omikuji2 >=30) {
          System.out.println("omikujiの中身は" + omikuji2 + "なので大吉");
        } else {
          System.out.println("omikujiの中身は" + omikuji2 + "なので大凶");
        }

// RPGのクリティカルヒットを再現
// 比較演算子 == > < >= <= !=


// スライムと戦っている。
// 1から10のサイコロをふって、
// 6未満：サイコロの目だけダメージを与えたと表示。
// 6以上：クリティカルヒットとして、100のダメージを与えたと表示。

        int hit = (int)(Math.random() * 10 * 1);
        System.out.println(hit);
        }
    }
}

