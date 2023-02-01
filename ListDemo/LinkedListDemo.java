import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("a");
        l1.add(1);
        l1.add(5);
        l1.add("l1");
        l1.add(null);
        System.out.println(l1);
        l1.set(0, "b");
        l1.addFirst("shuabhm");
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
    }
}
