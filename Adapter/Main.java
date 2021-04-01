public class Main {
    public static void main(String[] argv){
        Print1 p1 = new PrintBanner1("Hello");
        p1.printWeak();
        p1.printStrong();
        Print2 p2 = new PrintBanner2("Hello");
        p2.printWeak();
        p2.printStrong();
    }
}