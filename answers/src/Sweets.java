public class Sweets {
 int price;
 int sugar;

 public Sweets(int price, int sugar) {
   this.price = price;
   this.sugar = sugar;
 }

  @Override
  public String toString() {
    return "" + getClass();
  }
}
