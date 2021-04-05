package potato;

import framework.*;
import java.util.*;

public class PotatoFactory extends Factory {
  private List owners = new ArrayList<>();

  protected Food createFood(String owner) {
    return new Potato(owner);
  }

  protected void registerFood(Food food) {
    owners.add(((Potato) food).getOwner());
  }

  public List getOwners() {
    return owners;
  }
}
