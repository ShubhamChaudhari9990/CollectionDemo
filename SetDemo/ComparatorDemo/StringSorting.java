package SetDemo.ComparatorDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class StringSorting {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>(new MyComparator());
        ts.add("a");
        ts.add(new StringBuffer("A"));
        ts.add("bb");
        ts.add("za");
        ts.add("fast");
        System.out.println(ts);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        String s1 = o1.toString();
        String s2 = o2.toString();

        int i1 = s1.length();
        int i2 = s2.length();
        
        if(i1>i2)
        {
            return +1;
        }
        else if(i1<i2)
        {
            return -1;
        }
        else{
            return s1.compareTo(s2);
        }
    }
}