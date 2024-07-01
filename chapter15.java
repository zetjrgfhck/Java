public class chapter15 {
  public static void main(String[] args) {
    System.out.println(true || false); //どちらか一方
    System.out.println(true && false); //両方
    System.out.println(8 < 5 && 3 >= 2); //「8 < 5」かつ「3 >= 2」 
    System.out.println(8 < 5 || 3>=2); //「8 < 5」または「3 >= 2」
    System.out.println(!(8 < 5)); //「8 < 5」でない
  }
}