package potato;

import framework.*;

public class Potato extends Food {
  private String owner;

  Potato(String owner) {
    System.out.println("I make " + owner + "s potatoes");
    this.owner = owner;
  }

  public void use() {
    System.out.println("I make " + owner + "s potatoes");
  }

  public String getOwner() {
    return owner;
  }
}
