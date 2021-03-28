public class Box implements Aggregate{
    private Item[] items;
    private int last = 0;
    public Box(int maxsize){ 
        this.items = new Item[maxsize];
    }
    public Item getItemAt(int index){
        return items[index];
    }
    public void appendItem(Item item){
        this.items[last] = item;
        last++;
    }
    public int getLength(){
        return last;
    }
    public Iterator iterator() {
        return new BoxIterator(this);
    }
}