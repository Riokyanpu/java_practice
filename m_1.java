// HTMLを表示する
public class m_1 {
	public static void main(String[] args) {
		System.out.println("<h1>hello world</h1>");
		System.out.println("<p>世界の皆さん");
		System.out.println("<b>こんにちは</b></p>");
    
// 変数を使う
    String player = "戦士";
		System.out.println(player +"は、荒野を歩いていた");
		System.out.println(player +"は、モンスターと戦った");
		System.out.println(player +"は、モンスターをたおした");

// 数の表示とサイコロ   
    double rand = Math.random();
    System.out .println(rand);
    int number = 100;
    System.out.println("スライムが" + number + "匹あらわれた");    

// 数の表示とサイコロ
double rand2 = Math.random() * 100 * 1; //小数点以下の数値を扱うことのできるデータ型
System.out.println(rand2);
int number2 = (int)rand2; //型変換（整数に）
System.out.println("スケルトン" + number2 + "体あらわれた");

//計算する
  int number3 = 100;
    System.out.println(number3);
    System.out.println(number3 + 20); //足し算
    System.out.println(number3 - 20); //引き算
    System.out.println(number3 * 20); //掛け算
    System.out.println(number3 / 20); //割り算
    System.out.println(number3 % 15); //あまり
    System.out.println(number3 + 100 + 20 * 3); 
		System.out.println(number3 + (100 + 20) * 3); //高い ( ) ｜ * / % 低い + -

// 値段を計算する
		 int apple_price = 350;  //リンゴの単価
		 int apple_num = 5;      //リンゴを買う数
		 System.out.println("りんごの単価:" + apple_price + "円");
		 System.out.println("りんごを買う数:" + apple_num + "個");
		 
		 int total = apple_price * apple_num;
		 System.out.println("合計金額" + total + "円"); 

     int apple_price2 = (int)(Math.random() * 3 + 1) * 100; //リンゴの単価
     int apple_num2 = (int)(Math.random() * 10 + 1);     // リンゴを買う数
     System.out.println("りんごの単価:" + apple_price2 + "円");
     System.out.println("りんごを買う数:" + apple_num2 + "円");
     
     int total2 = apple_num2 * apple_price2;
     System.out.println("合計金額:" + total2 + "円");

     int number4 =(int)(Math.random() * 10 + 1);	// 匹数 1 ～ 10
     System.out.println("体重100キロのスライムが、" + number4 + "匹あらわれた。");
     int total3 = number4 * 100;
     System.out.println("スライムの合計体重は、" + total3 + "キロです。");
	}
}