import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SandS {
    public static boolean isPossible(int [] a, int [] b , int n , int k) {
        Arrays.sort(a);

        Arrays.sort(b);

        for (int i = 0; i < n; i++) {
            if (a[i] + b[i] < k) {
                return false;

            }

        }
        return true;
    }
    public static void main(String[] Args){
        int [] a = { 1, 2, 3};
        int [] b = {2, 3 , 4};
        int k = 10;
        int n =a.length;
        if(isPossible(a, b, n , k)){
            System.out.println("yes");
        }
        System.out.println("no");
    }
}

