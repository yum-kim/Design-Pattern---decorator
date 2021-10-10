public class Main {

  public static void main(String[] args) {
  
    Drink drink = new Americano();
    System.out.println(drink.getName()); //americano
    System.out.println(drink.cost()); //2000

    //shot 추가
    drink = new Shot(drink);

    System.out.println(drink.getName()); //shot americano
    System.out.println(drink.cost()); //2200
  
    //syrup 추가
    drink = new Syrup(drink); //shot을 가지고 있는 drink
    
    System.out.println(drink.getName()); //syrup shot americano
    System.out.println(drink.cost()); //2300
  }

}