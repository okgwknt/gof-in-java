public class Singleton {
  private static Singleton singleton = new Singleton();

  private Singleton() {
    System.out.println("made instance");
  }

  public static Singleton getInstance() {
    return singleton;
  }
}
