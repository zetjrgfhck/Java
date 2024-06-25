public class chapter13 {
  public static void main(String[] args) {
    String name;
    name = "田中";
    System.out.println("名前は" + name + "です");

    int age = 20;
    System.out.println("年齢は" + age + "歳です");

    double height = 1.7;
    System.out.println("身長は" + height + "mです");


    double weight = 60.0;
    System.out.println("体重は" + weight + "kgです");

    double bmi = weight / height / height;
    System.out.println("BMIは"+ bmi + "です");
  }
}