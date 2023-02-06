package SetDemo.ComparatorDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet<>(new MyComparator());
        t.add(10);
        t.add(5);
        t.add(12);
        t.add(1);
        System.out.println(t);
    }
}
class MyComparator implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        
        // if(i1<i2)
        // {
        //     return +1;
        // }
        // else if(i1>i2)
        // {
        //     return -1;
        // }
        // else{
        //     return 0;
        // }

        //  OR 

        // return i1.compareTo(i2);     //  Ascending order
        return -i1.compareTo(i2);    //  Descending order
        // return i2.compareTo(i1);     //  Descending order
        // return -i2.compareTo(i1);    //  Ascending order
        // return +1;   //  Insertion order
        // return -1;   //  Reverse insertion order
        // return 0;    //  only first element inserted others considered as duplicates.
    }
}
