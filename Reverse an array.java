public class Reverse {
    public static void main(String Args[]){
        int [] array = { 1 , 2 , 3 , 4 ,5 };
        for(int i = 0 ; i<array.length; i++)
        System.out.println(array[i]);

        System.out.println("reverse array");
        for(int i= array.length-1; i>=0; i-- ){
            System.out.println(array[i]);
        }


    }
}
