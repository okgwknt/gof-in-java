public class Main {
    public static void main(String[] args){
        Box box = new Box(4);
        box.appendItem(new Item("pencil"));
        box.appendItem(new Item("eraser"));
        box.appendItem(new Item("glue"));
        box.appendItem(new Item("mouse"));
        Iterator it = box.iterator();
        while(it.hasNext()){
            Item item = (Item)it.next();
            System.out.println(item.getName());
        }
    }
}