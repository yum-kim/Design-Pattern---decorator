public class Syrup extends DrinkDecorator {
  
  public Syrup (Drink drink) {
    this.drink = drink;
  }

  @Override
  public String getName() {
    return "syrup " + drink.getName();
  }

  @Override
  public int cost() {
    return 100 + drink.cost();
  }
}