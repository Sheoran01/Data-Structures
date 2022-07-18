import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueY{
        public static void main(String args[]) {
            Queue<Integer> q = new LinkedList();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            System.out.println(q);
            Stack<Integer> s = new Stack<>();
            while (!q.isEmpty()) {
                s.push(q.remove());
            }
            Collections.reverse(s);
            System.out.println(s);

        }
    }
