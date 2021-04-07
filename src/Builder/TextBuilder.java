public class TextBuilder extends Builder {
  private StringBuffer buffer = new StringBuffer();

  public void makeTitle(String title) {
    buffer.append("----------\n");
    buffer.append("[" + title + "]");
  }

  public void makeString(String string) {
    buffer.append("sikaku" + string + "\n");
    buffer.append("\n");
  }

  public void makeItems(String[] items) {
    for (int i = 0; i < items.length; i++) {
      buffer.append("  ^" + items[i] + "\n");
    }
    buffer.append("\n");
  }

  public void close() {
    buffer.append("-------------\n");
  }

  public String getResult() {
    return buffer.toString();
  }
}
