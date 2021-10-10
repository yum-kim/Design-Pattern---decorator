public abstract class Drink {
  //멤버변수 name은 추상클래스의 자식이 쓸 것
  protected String name = "";

  //abstract method -> 상속받는 자식이 무조건 cost method를 구현해야함
  public abstract int cost();

  //getter, setter로 name에 접근할 수 있도록 함
  public String getName() {
    return name;
  }

  public void setName (String name) {
    this.name = name;
  }
}