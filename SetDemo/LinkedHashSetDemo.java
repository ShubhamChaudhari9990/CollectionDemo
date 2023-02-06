package SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet ls = new LinkedHashSet<>();
        ls.add("A");
        ls.add("c");
        ls.add("b");
        ls.add(2);
        ls.add(null);
        // hs.add("A");
        System.out.println(ls.add(2)); // print false bacause 2 is alredy presernt.
        System.out.println(ls); // print insertion order.
    }
}
