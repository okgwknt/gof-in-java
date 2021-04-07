import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder {
  private String filename;
  private PrintWriter writer;

  public void makeTitle(String title) {
    filename = title + ".html";
    try {
      writer = new PrintWriter(new FileWriter(filename));

    } catch (IOException e) {
      e.printStackTrace();
    }
    writer.println("<html><head><title>" + title + "</title></head></body>");
  }

  public void makeString(String string) {
    writer.println("<p>" + string + "<p>");
  }

  public void makeItems(String[] items) {
    writer.println("ul");
    for (int i = 0; i < items.length; i++) {
      writer.println("<li>" + items[i] + "<li>");
    }
    writer.println("</ul>");
  }

  public void close() {
    writer.println("</body></html>");
  }

  public String getResult() {
    return filename;
  }
}
