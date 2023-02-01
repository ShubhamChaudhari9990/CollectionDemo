import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        System.out.println("Capacity is="+v.capacity());
        System.out.println("before adding Size ="+v.size());
        for(int i=1;i<=10;i++)
        {
            v.addElement(i);
        }
        System.out.println("after adding elements Size = "+v.size());
        v.addElement("a");
        System.out.println("Capacity is increase by 2*current capacity = "+v.capacity());
        System.out.println(v);
    }
}
