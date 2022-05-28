public class Bit {
    public static int bitCount(int num){
        int count = 0;
        while(num>0) {
            count += num & 1;
            num >>= 1;

        }
        return count;

    }
    public static void main(String[] args){
        int num = 10;
        System.out.println(bitCount(num));
    }
}
