public class Maxsubarray2 {
    public static void main(String Args[]){
        int [] array = { 1, -2 , - 3 , 4, 5, 6,7};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<array.length; i++) {
            sum += array[i];
            if (sum < 0) {
                sum = 0;
            } else if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
