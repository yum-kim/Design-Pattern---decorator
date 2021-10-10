public class Americano extends Drink {
  public Americano() {
    //Drink 멤버변수의 name값을 초기화
    name = "americano";
  }

  @Override
  public int cost() {
    return 2000;
  }
}