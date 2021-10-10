public abstract class DrinkDecorator extends Drink {
  protected Drink drink;
  //Drink(부모)의 참조변수를 저장하기 위한 멤버변수가 필수로 필요

  public abstract String getName();
  //DrinkDecorator를 상속받는 자식이 getName 구현

}


/* 데코레이터 패턴의 특징 */
/* 
1) 데코레이터 역할을 해주는 아이가 필요하며, 데코레이터 역할하는 클래스는 Americano와 같은 계층 클래스임
2) Drink의 참조변수를 멤버변수로 가질 수 있도록 함
*/