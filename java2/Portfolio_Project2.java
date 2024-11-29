public class Portfolio_Project2 {
    public static void main(String[] args) {
      runChapter1();  // Chapter 2のメソッド呼び出し

    }
     
      public static void runChapter1()  {
        int number =(int)(Math.random() * 5 + 1);
        System.out.println("あなたの順位は" + number + "位です");
        if (number == 1) {
            System.out.println("おめでとう！");
        } else {
            System.out.println("あと少し！") ;
        }
    }
}
