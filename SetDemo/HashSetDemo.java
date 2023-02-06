package SetDemo;
import java.util.HashSet;

class HashSetDemo
{
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add("A");
        hs.add("c");
        hs.add("b");
        hs.add(2);
        hs.add(null);
        // hs.add("A");
        System.out.println(hs.add(2)); // print false bacause 2 is alredy presernt.
        System.out.println(hs); //
    }
}