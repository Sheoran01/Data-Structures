import java.util.Deque;
import java.util.LinkedList;
import java.util.*;

public class Deques {
    public static void main(String args[]){
        Deque<Integer> dq = new LinkedList<>();
        dq.add(1);
        dq.add(2);
        dq.add(3);
        dq.add(4);
        dq.add(5);
        dq.addFirst(7);
        System.out.println(dq);
        Stack<Integer> s = new Stack<>();
        while (!dq.isEmpty()){
            s.push(dq.removeLast());
        }
        System.out.println(s);


    }
}
