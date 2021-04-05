package framework;

public abstract class Factory {
  public final Food create(String owner) {
    Food food = createFood(owner);
    registerFood(food);
    return food;
  }

  protected abstract Food createFood(String owner);

  protected abstract void registerFood(Food food);
}
