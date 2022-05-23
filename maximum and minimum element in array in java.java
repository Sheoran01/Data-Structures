public class MaxandMin {
    public int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }

        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;

    }

    public static void main(String Args[]) {
        int [] array = {23 , 24, 45 , 89 , 112};
        MaxandMin m = new MaxandMin();
        System.out.println("maximum "+ m.max(array));
        System.out.println("minimum"+ m.min(array));


    }
}



