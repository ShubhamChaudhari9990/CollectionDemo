package SetDemo.ComparableDemo;

public class Test {
    public static void main(String[] args) {
        System.out.println("A".compareTo("Z"));
        System.out.println("Z".compareTo("A"));
        System.out.println("A".compareTo("A"));
        System.out.println("A".compareTo(null));    // RuntimeException :- NullPointerException
    }
}
