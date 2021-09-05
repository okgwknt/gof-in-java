package AbstractFactory.factory;

import AbstractFactory.listfactory.ListPage;

public abstract class Factory {
  public static Factory getFactory(String classname) {
    Factory factory = null;
    try {
      factory = (Factory) Class.forName(classname).newInstance();
    } catch (ClassNotFoundException e) {
      System.err.println("Class " + classname + " is not found.");
      ;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return factory;
  }

  public abstract Link createLink(String caption, String url);

  public abstract Tray createTray(String caption);

  public abstract ListPage createPage(String title, String author);
}
