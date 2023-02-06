package SetDemo;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();   
        /*
            In comparable has only 1 method that is compareTo().
            It has returns 3 conditions:- 
                when obj1 has come before obj2 then return -ve.
                when obj1 has come after obj2 then return +ve.
                when obj1 & obj2 are equal then return 0.
            In default constructor object should be homogeneous and comparable. 
            otherwise error ClassCastException occurs.
         */
        ts.add(new StringBuffer("a"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("Z"));
        System.out.println(ts);
    }
}
