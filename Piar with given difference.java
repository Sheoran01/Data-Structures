public class Commondiff {
    public static boolean commondiff(int [] a, int n){
    int size = a.length;

    int i = 0;
    int j = 1;
    while(i<a.length && j<a.length){
        if(i!=j && (a[i] - a[j] == n || a[j] - a[i] == n)){
            System.out.println(("Pair Found: "+
                    " "+a[i]+", "+ a[j]));
            return true;
        }
        else if(a[j] - a[i]<n){
            i++;

        }
        else{
            j++;
        }
    }
    System.out.println("no such element");
    return false;
    }
    public static void main(String [] args){
        int [] a = {1, 2, 4,5 , 6};
        int n = 1;
        commondiff(a,n);
    }
}
