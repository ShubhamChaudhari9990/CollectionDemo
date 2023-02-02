package CursorsDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();
        l.add("shubham");
        l.add("prashant");
        l.add("dinesh");
        l.add("nikhil");
        System.out.println(l);
        ListIterator itr = l.listIterator();
        while(itr.hasNext())
        {
            String s = (String) itr.next();

            if(s.equals("shubham"))
            {
                itr.remove();
            }
            else if(s.equals("dinesh"))
            {
                itr.add("tejas");
            }
            else if(s.equals("nikhil"))
            {
                itr.set("shreyash");
            }
        }
        System.out.println(l);
        
    }
}
