public class chapter10 {
  public static void main(String[] args) {
    int length = 6;   //横の長さを定義
    int height = 8;   //縦の長さを定義
    int rectangleArea = length * height; //四角形の面積の合計を定義
    System.out.println(rectangleArea);

    int triangleArea = length * height / 2; //三角形の面積の合計を定義
    System.out.println(triangleArea);
  }
}