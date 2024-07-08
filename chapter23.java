public class chapter23 {
  public static void main(String[] args) {
    String[] names ={"にんじゃわんこ" , "ひつじ仙人" , "ベイビーわんこ"};

    // for文を用いて、「私の名前は◯◯です」と出力してください
    for(int i = 0; i < names.length; i++){
      System.out.println("私の名前は" + names[i] + "です");
    }
    
    //拡張for文
    for(String name : names) {
      System.out.println("私の名前は" + name + "です");
    }
  }
}