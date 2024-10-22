package problem;

import java.util.*;
public class D185 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 時給を整数として読み取る
        int wage  = sc.nextInt();

        // 働いた時間を整数として読み取る
        int work  = sc.nextInt();

        // 給与を計算する
        int total = wage * work ;
        
        // 計算された給与を出力する
        System.out.println(total);
    }
}


