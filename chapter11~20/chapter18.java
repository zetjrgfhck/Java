public class chapter18 {
  public static void main(String[] argd) {
    int n = 3;
    switch(n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;
      default: //どれにも当てはまらない場合の処理
        System.out.println("凶です");
        break;
    }
  }
}