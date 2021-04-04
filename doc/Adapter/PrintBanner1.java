public class PrintBanner1 extends Banner implements Print1{
    public PrintBanner1(String string){
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}