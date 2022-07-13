import java.util.ArrayList;
public class Arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        int element = list.get(0);
        System.out.println(element);
        list.set(1, 3);
        System.out.println(list);
    }
}
