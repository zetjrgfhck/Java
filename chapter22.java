public class chapter22 {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ" , "ひつじ仙人" , "ベイビーわんこ"}; //{}で配列を記述、[]の前に間空けない
    System.out.println(names[0]);
    System.out.println(names[1]);
    //インデックス番号が0の要素を出力してください。
    //インデックス番号が2の要素を出力してください。
    names[1] = "Java"; //上書き
    System.out.println(names[1]);
  }
}