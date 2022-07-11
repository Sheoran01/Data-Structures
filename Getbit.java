public class GetBit {
    public static void main(String args[]){
        int n = 8;
        int pos = 3;
        int bitmask = 1<<pos;

        if((bitmask & n) == 0){
            System.out.println("no is zero");
        }else{
            System.out.println("no is not zero");
        }
    }
}
