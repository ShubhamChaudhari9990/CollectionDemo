import java.util.ArrayList;
import java.util.List;

class ArrayListDemo
{
    public static void main(String[] args) {
        List al = new ArrayList();
        al.add(1);
        al.add("a");
        al.add(null);
        System.out.println(al);
        al.remove(2);
        al.add(5);
        al.add(2, "b");
        System.out.println(al);
    }
}