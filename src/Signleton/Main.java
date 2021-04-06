public class Main {
  public static void main(String[] args) {
    System.out.println("Start.");
    Singleton object1 = Singleton.getInstance();
    Singleton object2 = Singleton.getInstance();
    if (object1 == object2) {
      System.out.println("object1 and object2 is the same.");
    } else {
      System.out.println("object1 and object2 is not the same.");
    }
    System.out.println("End.");
  }
}
