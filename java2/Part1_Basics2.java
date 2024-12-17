public class Part1_Basics2 {
public static void main(String[] args) {
    int number = 2;
        if (number == 1) {
                System.out.println("OK"); //条件式が成立した時の処理
        } else {
            System.out.println("ON!"); //条件式が成立しない時の処理
        }
//02:複数の条件を組み合わせてみよう
    int number2 = 2;
        if (number2 == 1) {
            System.out.println("問題ない");		// 条件式が成立したときの処理
        } else if (number2 ==2) {
            System.out.println("どちらでもない"); //条件式2が成立した時の処理
        } else {
            System.out.println("問題あり");		// 条件式が成立しなかったときの処理
        }
//03:比較演算子で条件分岐してみよう
    int time = 12;
        if (time < 12) {
            System.out.println("午前中"); // 条件式が成立したときの処理
        } else if (time == 12) {
            System.out.println("正午");
        } else if (time >12) {
            System.out.println("午後");
        }
//04:おみくじを作ってみよ
// おみくじを作る
// 比較演算子  ==  >  <   >=  <=  !=
// 大吉  中吉  小吉  凶  大凶
        int omikuji = (int)(Math.random() * 10 + 1);
        //System.out.println(omikuji);
        if (omikuji == 1) {
                System.out.println("大吉");
        } else if (omikuji == 2) {
                System.out.println("中吉");
	    } else if (omikuji <= 4) {
	            System.out.println("小吉"); // 3,4
        } else if (omikuji <= 7) {
                System.out.println("凶");   // 5,6,7
        } else {
                System.out.println("大凶"); //8,9,10
        }

    }
  
}
