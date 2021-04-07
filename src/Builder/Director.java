public class Director {
  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.makeTitle("Greeting");
    builder.makeString("from morning to afternoon");
    builder.makeItems(new String[] {"Good morning.", "Hello."});
    builder.makeString("evening");
    builder.makeItems(new String[] {"Good night.", "Good Bye.", "Bye Bye."});
    builder.close();
  }
}
