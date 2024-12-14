public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.display();
        list.deleteFist();
        list.display();
    }
}