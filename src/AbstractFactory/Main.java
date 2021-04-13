import factory.*;

public class Main {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.exit(0);
    }
    Factory factory = Factory.getFactory(args[0]);
    Link github = factory.createLink("github", "https://github.com");
    Link youtube = factory.createLink("youtube", "https://www.youtube.com");

    Link google = factory.createLink("google", "https://www.google.com");
    Link okgwknt = factory.createLink("okgwknt", "https://okgwknt.github.io");
    Link ritsumei = factory.createLink("ritsumei", "http://www.ritsumei.ac.jp");
    Link twitter = factory.createLink("twitter", "https://twitter.com");

    Tray traysns = factory.createTray("sns");
    traysns.add(github);
    traysns.add(twitter);

    Tray traysearch = factory.createTray("search");
    traysearch.add(google);
    traysearch.add(github);
    traysearch.add(youtube);
    traysearch.add(ritsumei);

    Tray traygoogle = factory.createTray("google");
    traygoogle.add(google);
    traygoogle.add(youtube);

    Page page = factory.createPage("okgwknt", "okugawa");
    page.add(okgwknt);
    page.add(traysearch);
    page.output();
  }
}
