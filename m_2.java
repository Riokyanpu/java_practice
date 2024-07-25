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
                System.out.println("おめでとう!");
        } else{
                System.out.println("あなたの順位は" + number2 + "位です");
        } 
        }
    }
}

