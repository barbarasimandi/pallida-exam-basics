import java.util.ArrayList;

public class CandyShop {

  int sugar;
  int income;
  ArrayList<Sweets> listOfSweets;
  Lollipop LOLLIPOP;
  Candy CANDY;
  Sweets sweet;

public CandyShop(int grams) {
  this.sugar = grams;
  this.income = 0;
  this.LOLLIPOP = new Lollipop();
  this.CANDY = new Candy();
  }

  public void createSweets(Sweets sweets) {
    this.listOfSweets = new ArrayList<>();
    listOfSweets.add(sweets);
    this.income -= sweets.price;
  }

  public double raise(int percent) {
    /*this.sweet = new Sweets(1, 1);*/

    if(blah instanceof Candy) {
      return CANDY.price *= (percent / 100);
    } return LOLLIPOP.price *= (percent / 100);
  }

  public void sell(Sweets sweet, int amount) {
    this.income += sweet.price * amount;
    listOfSweets.remove(sweet);
  }

  public void buySugar(int amount) {
    this.sugar += amount;
    this.income -= amount/100;
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < listOfSweets.size(); i++) {
      result += listOfSweets.size() + " " + listOfSweets.get(i) + " Income: " + this.income + " Sugar: " + this.sugar;
    }
    return "Inventory:" + result;
  }
}
