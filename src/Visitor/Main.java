public class Main {
  public static void main(String[] args) {
    try {
      System.out.println("Makeing root entries...");
      Directory rootdir = new Directory("root");
      Directory bindir = new Directory("bin");
      Directory tmpdir = new Directory("tmp");
      Directory usrdir = new Directory("usr");
      rootdir.add(bindir);
      rootdir.add(tmpdir);
      rootdir.add(usrdir);
      bindir.add(new File("vi", 10000));
      bindir.add(new File("latex", 20000));
      rootdir.accept(new ListVisitor());

      System.out.println("");
      System.out.println("Making user entries...");
      Directory tom = new Directory("tom");
      Directory taro = new Directory("taro");
      Directory hana = new Directory("hana");
      usrdir.add(tom);
      usrdir.add(taro);
      usrdir.add(hana);
      tom.add(new File("diary.html", 100));
      tom.add(new File("memo.txt", 200));
      taro.add(new File("game.doc", 300));
      taro.add(new File("dev.md", 400));
      hana.add(new File("jun.mail", 500));
      rootdir.accept(new ListVisitor());
    } catch (FileTreatmentException e) {
      e.printStackTrace();
    }
  }
}
