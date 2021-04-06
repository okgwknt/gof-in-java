package framework;

import java.util.*;

public class Manager {
  private HashMap<String, Product> showcase = new HashMap<String, Product>();

  public void register(String name, Product prototype) {
    showcase.put(name, prototype);
  }

  public Product create(String prototypeName) {
    Product product = (Product) showcase.get(prototypeName);
    return product.createClone();
  }
}
