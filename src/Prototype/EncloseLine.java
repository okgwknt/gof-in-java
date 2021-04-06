import framework.*;

public class EncloseLine implements Product {
  private char decochar;

  public EncloseLine(char decochar) {
    this.decochar = decochar;
  }

  public void use(String string) {
    int length = string.getBytes().length;
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decochar);
    }
    System.out.println("");
    System.out.println(decochar + " " + string + " " + decochar);
    for (int i = 0; i < length + 4; i++) {
      System.out.print(decochar);
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
