import framework.*;

public class Main {
  public static void main(String[] args) {
    // ready
    Manager manager = new Manager();
    UnderLine underline = new UnderLine('~');
    EncloseLine sterbox = new EncloseLine('*');
    EncloseLine slashbox = new EncloseLine('/');
    manager.register("strong message", underline);
    manager.register("ster box", sterbox);
    manager.register("slash box", slashbox);

    // create
    Product product1 = manager.create("strong message");
    product1.use("Hello World.");
    Product product2 = manager.create("ster box");
    product2.use("Hello World.");
    Product product3 = manager.create("slash box");
    product3.use("Hello World.");
  }
}
