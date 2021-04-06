import framework.*;
import potato.*;

public class Main {
  public static void main(String[] args) {
    Factory factory = new PotatoFactory();
    Food potato1 = factory.create("Owen");
    Food potato2 = factory.create("Chen");
    Food potato3 = factory.create("Kim");
    potato1.use();
    potato2.use();
    potato3.use();
  }
}
