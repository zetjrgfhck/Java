public class chapter17 {
  public static void main(String[] args) {
    int number = 12;

    if (number < 10) {
      System.out.println("10より小さい");
    } else if (number < 20) {
      System.out.println("10以上、20より小さい");
    } else {
      System.out.println("20以上");
    }
  }
}
// numberが20より小さいとき、どちらでもないときの条件分岐を追加してください