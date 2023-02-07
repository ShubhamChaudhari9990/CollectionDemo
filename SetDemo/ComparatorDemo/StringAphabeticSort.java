package SetDemo.ComparatorDemo;

import java.util.TreeSet;

public class StringAphabeticSort {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet<>();
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("R"));
        ts.add(new StringBuffer("D"));
        System.out.println(ts);
    }
}
