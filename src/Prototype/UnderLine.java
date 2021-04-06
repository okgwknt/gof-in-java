import framework.*;

public class UnderLine implements Product {
  private char ulchar;

  public UnderLine(char ulchar) {
    this.ulchar = ulchar;
  }

  public void use(String string) {
    int length = string.getBytes().length;
    System.out.println("\"" + string + "\"");
    System.out.print(" ");
    for (int i = 0; i < length; i++) {
      System.out.print(ulchar);
    }
    System.out.println("");
  }

  public Product createClone() {
    Product product = null;
    try {
      product = (Product) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return product;
  }
}
