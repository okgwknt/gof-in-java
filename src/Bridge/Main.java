public class Main {
  public static void main(String[] args) {
    Display display1 = new Display(new StringDisplayImpl("Hello"));
    Display display2 = new Display(new StringDisplayImpl("Bye"));
    CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Hell"));
    display1.display();
    display2.display();
    display3.display();
    display3.multiDisplay(5);
  }
}
