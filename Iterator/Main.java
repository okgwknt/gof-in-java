import javax.swing.Box;

public class Main {
    public static void main(String[] args){
        Box box = new Box(4);
        box.appendItem(new Item("one"));
        box.appendItem(new Item("two"));
        box.appendItem(new Item("three"));
        box.appendItem(new Item("four"));
        Iterator it = box.iterator();
        while(it.hasNext()){
            Item item = (Item)it.next();
            System.out.println(item.getName());
        }
    }
}