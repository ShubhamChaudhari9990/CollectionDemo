import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s = new Stack<>();
        s.push("s");    //  5    <=(offsert) 
        s.push("z");    //  4
        s.push("c");    //  3
        s.push("s");    //  2
        s.push(1);      //  1
        System.out.println(s);
        System.out.println(s.search(1)); //it return the (offset) of stack.if not found then return -1. 
        System.out.println(s.peek()); //search last element of stack.
        System.out.println(s.pop()); //remove last element of stack
        System.out.println(s);
    }
}
