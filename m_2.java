import java.util.Calendar;

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
        if (hit < 6) {
	        System.out.println("スライムに、" + hit + "のダメージを与えた!");
	      } else {
          System.out.println("クリティカルヒット！スライムに、100のダメージを与えた！");
        } 
        int add = (int)(Math.random() * 10 + 1); // この行を修正して1から2のサイコロになるようにする
        System.out.println("追加のサイコロは、" + add);
        if (add == 1) { // この行の条件式を修正
          System.out.println("追加攻撃!スライムに、10のダメージを与えた!!!");
        } else {
          System.out.println("追加攻撃に失敗!");
        }
        Calendar calendar = Calendar.getInstance();
        int seireki = calendar.get(calendar.YEAR);
        //int seireki = 2015;
        System.out.println("西暦" + seireki + "年");
        
        //西暦年から平成年を求める
        //平成1年とは、西暦1989年、その差は、1988
        //例：西暦年 - 1988 = 平成1年とは、平成１年
        //例：西暦2015 - 1988 = 平成27年
        
        int heisei = seireki - 1988;
        System.out.println("平成" + heisei + "年です。");
  
// 複数の条件を組み合わせる - AND
        int number4 = 1;
        int number5 = 1;
        if (number4 == 1 && number5 == 1) {
            System.out.println("スキ!");  //条件が成立した時の処理
        } else {
            System.out.println("キライ"); //条件が成立しなかった時の処理
        }
        double rand = Math.random() * 100 + 1;
        int number6 = (int)rand;
        System.out.println(number6);
        if (number6 >= 30 && number6 <= 60) {
            System.out.println("あたり");
        } else {
            System.out.println("残念");
        }
        double rand2 = (Math.random() * 10) + 1;
        int number_p1 = (int) rand2;
        System.out.println("あなたの順位は" + number + "位です");

        if (number_p1 >=2 && number_p1 <=5) {
            System.out.println("あと少し");
        }
// 複数の条件を組み合わせる - OR

        if (number4 == 1 || number5 == 1) {
            System.out.println("スキ!");  //条件が成立した時の処理
        } else {
            System.out.println("キライ"); //条件が成立しなかった時の処理
        }
        //int number6 = 1;
        System.out.println(number6);
        if (number6<=30 || number6 >= 60) {
            System.out.println("あたり");
        } else {
            System.out.println("ハズレ");
        }
        //double rand = (Math.random() * 71) + 30;
        int discomfort = (int) rand;
        System.out.println("不快指数は" + discomfort + "です。");

        if (discomfort <=55 || discomfort >=70) {
        System.out.println("不快です");
       
        }
        // 条件の評価結果
        //int number =1;
        boolean flag = number == 1;
        if (number == 1) {
            System.out.println("OK"); //条件が成立した時の処理
        } else {
            System.out.println("NO"); //条件が成立しなかった時の処理
        }
        System.out.println(flag);
        
        System.out.println("あなたの順位は" + number + "位です");
        //boolean flag = number <= 3;
        if (number <= 3) {
            System.out.println("入賞おめでとう");
        }
// データ型 
    //public class Main {
      //public static void main(String[] args) {
        System.out.println(10 / 3);  // 整数同士の割り算（結果: 3）。小数点以下は切り捨てられる。
        System.out.println(10 / 3.0);  // 整数を実数（3.0）で割ることで、結果が浮動小数点数になる（結果: 3.333...）。
        
        double number1 = 3.14;  // 浮動小数点数（double型）の変数number1に3.14を代入。
        System.out.println(number1);  // そのままnumber1を出力（結果: 3.14）。
        System.out.println((int)number1);  // number1をint型にキャスト（変換）し、小数点以下を切り捨てて出力（結果: 3）。
        
        //int number2 = 3;  // 整数（int型）の変数number2に3を代入。
        System.out.println(number2);  // そのままnumber2を出力（結果: 3）。
        System.out.println((double)number2);  // number2をdouble型にキャストし、実数として出力（結果: 3.0）。
        
        String text = "123";  // 文字列"123"をtext変数に代入。
        System.out.println(text);  // 文字列をそのまま出力（結果: "123"）。
        System.out.println(Integer.parseInt(text) * 10);  // 文字列を整数に変換し、10倍して出力（結果: 1230）。
        System.out.println(Double.parseDouble(text) * 10);  // 文字列を浮動小数点数に変換し、10倍して出力（結果: 1230.0）。

        String text2 = "0.08";
        double number7 = Double.parseDouble(text2); // 文字列をdouble型に変換
        System.out.println(number7);
       
// 税込み金額を計算する
//public class Main {
  //public static void main(String[] args) {
      // 商品の定価を設定
      int price = 3500; 
      System.out.println("定価 :" + price + "円");
      
      // 15%割引後の価格を計算し、int型にキャストして小数点以下を切り捨てる
      int discountPraice = (int)(price * 0.85); 
      System.out.println("割引価格は :" + discountPraice + "円です。");

      // 割引後の価格に8%の消費税を加算して税込価格を計算
      // 結果はdouble型になるが、int型にキャストして小数点以下を切り捨てる
      int amount = (int)(discountPraice * 1.08); 
      System.out.println("税込み価格は :" + amount + "円です。");

      // 人数を5人と設定
      int person = 5; 
      System.out.println("人数が、" + person + "人の場合。");

      // 一人当たりの支払額を計算（総額を人数で割った商）
      int amountPerPerson = amount / person;

      // 割り切れない場合の余りを計算
      int remainder = amount % person;

      // 一人当たりの支払額と余りを表示

            // 100グラムあたりの価格を128円に設定
            int price2 = 128; 
            
            // 肉の重さを300グラムに設定
            int weight = 300; 
            
            // 総額を計算する
            // 100グラムあたりの価格に重さを掛け、その結果を100で割って、実際の金額を計算
            int amount2 = price2 * weight / 100; 
            
            // 結果を表示する
            System.out.println("100グラム" + price2 + "円の肉、" + weight + "グラムは、" + amount2 + "円です。");

    
      
      }

    }
}

