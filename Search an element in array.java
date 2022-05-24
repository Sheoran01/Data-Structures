public class Search {
        public static int Search(int[] array , int key){
            for(int i = 0 ; i<array.length; i++){
                if(array[i]==key){
                    System.out.println(key);
                }
            }
            return key;
        }
        public static void main(String Args[]){
            int[] a = {1 , 2 , 3 , 4, 5};
            System.out.println(Search(a,3));
        }
    }
