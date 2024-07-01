public class chapter16 {
  public static void main(String[] args) {
    if (true) {
      System.out.println("条件式がtrueのため出力される");
    }

    if (false) {
      System.out.println("条件式がfalseのため出力されない");
    }

    int x = 5;
    if (x > 2) { //2より大きい場合を定義
      System.out.println("xは2より大きい");
    }
    if (x > 8) { //8より大きい場合を定義
      System.out.println("xは8より大きい");
    }
  }
}