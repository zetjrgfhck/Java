public class chapter21 {
  public static void main(String[] args) {
    //while文の処理で、
    //iが5の倍数のとき、繰り返し処理を終了してください（ただし、iの値の出力の前で行ってください）。
    System.out.println("=== while文 ===");
    int i = 1;
    while(i < 10) {
      if(i % 5 == 0) {
        break;
      }
      System.out.println(i);
      i++;
    }

    System.out.println("=== for文 ===");
    for(int j = 1; j <10; j++) {
      if(j % 3 == 0) {
      continue;
      }
      System.out.println(j);
    }
  }
}
  //for文の処理で、
  //jが3の倍数のとき、処理をスキップしてください（ただし、jの値の出力の前で行ってください）。