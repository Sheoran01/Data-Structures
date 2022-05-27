import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Reversell {
    public static void main(String[] Args) {
        LinkedList<String> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 20; i++) {
            list.add(sc.next());
            System.out.println(list);

            Collections.reverse(list);
            System.out.println(list);




        }



    }
}
