import java.util.Scanner;

public class UpdateBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int bitToUpdate = sc.nextInt();

        int n = 6;
        int pos = 2;

        if(bitToUpdate==1){
        int bitMask = 1<<pos;
        int newNumber = bitMask | n;
        System.out.println(newNumber);


    }else{
            int bitMask = 1<<pos;
            int notBitmask = ~(bitMask);
            int newNumber = notBitmask & n;
            System.out.println(newNumber);
        }
        }
}
