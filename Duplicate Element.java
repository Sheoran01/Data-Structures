public class Search {
        public static int Search(int[] array ){
            for(int i = 0 ; i<array.length; i++){
                if(array[i] == array[i+1]){
                    System.out.println("Duplicate found "+array[i+1]);
                }
            }
            return 0;
        }
        public static void main(String Args[]){
            int[] a = {1 , 2 , 3 , 4,4, 5};
            System.out.println(Search(a));
        }
    }
