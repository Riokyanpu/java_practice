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
	}
}