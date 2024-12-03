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
    }
  
}
