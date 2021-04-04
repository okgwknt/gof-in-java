public class Main {
  public static void main(String[] args) {
    AbstractDisplay display1 = new CharDisplay('F');
    display1.display();
    AbstractDisplay display2 = new StringDisplay("Hello, World!");
    display2.display();
  }
}
