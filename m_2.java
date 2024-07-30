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
        }
    }
}

