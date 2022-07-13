import java.util.LinkedList;

public class LL {
    public static void main(String args[]){
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(0);
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());
    }
}
