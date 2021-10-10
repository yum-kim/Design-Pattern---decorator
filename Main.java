public class Main {

  public static void main(String[] args) {
  
    Drink drink = new Americano();
    System.out.printIn(drink.getName()); //Americano
    System.out.printIn(drink.cost()); //2000

  
    drink = new Shot(drink);
    drink = new Syrup(drink);

    System.out.printIn(drink.getName());
    System.out.printIn(drink.cost());


  }
}