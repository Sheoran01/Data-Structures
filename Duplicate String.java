import java.util.Scanner;

public class dstring {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        char [] carray = s.toCharArray();
        System.out.println("duplicate char in string are:");
        for (int i = 0 ; i<s.length(); i++){
            for(int j = i+1; j<s.length(); j++){
                if(carray[i] == carray[j]){
                    System.out.println(carray[j]);
                    break;
                }
            }
        }
    }
}
