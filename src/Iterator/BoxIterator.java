public class BoxIterator implements Iterator {
  private Box box;
  private int index;

  public BoxIterator(Box box) {
    this.box = box;
    this.index = 0;
  }

  public boolean hasNext() {
    if (index < box.getLength()) {
      return true;
    } else {
      return false;
    }
  }

  public Object next() {
    Item item = box.getItemAt(index);
    index++;
    return item;
  }
}
