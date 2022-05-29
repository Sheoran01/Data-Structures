import java.util.Scanner;

public class P9 {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();

    char character = sc.nextLine().charAt(0);
    int count = 0;

    for(int i = 0; i< n.length(); i++){
        if(character == n.charAt(i)){
    count++;
        }
    }
    System.out.println(count);

}
}
