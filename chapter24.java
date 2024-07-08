public class chapter24 {
  public static void main(String[] args) {
    // 変数numbersに、与えられた数字の配列を代入
    int[] numbers ={1, 4, 6, 9, 13, 16};
    
    int oddSum = 0; //奇数の値を定義
    int evenSum = 0; //偶数の値を定義
    
     // for文を用いて、配列numbersの偶数の和と奇数の和を求める
     for(int number : numbers) {
       if(number % 2 == 0) { //偶数の場合の分岐
         evenSum += number;
       } else {
         //奇数の場合
         oddSum += number; 
       }
     }
     System.out.println("奇数の和は" + oddSum +"です");
     System.out.println("偶数の和は" + evenSum +"です");
  }
}