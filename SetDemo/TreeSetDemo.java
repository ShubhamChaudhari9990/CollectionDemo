package SetDemo;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>();
        t.add("A");
        t.add("b");
        t.add("C");
        t.add("R");
        t.add("Z");
        // t.add(new Integer(10)); error occurs ClassCastException. */
        // t.add(null); NullPointerException occurs. 
        t.add("a");


        System.out.println(t);

    }
}
