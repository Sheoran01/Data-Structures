public class Commonelement {
    public static void common(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length && k < c.length) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.println(a[i] + " ");
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }

    }


    public static void main(String args[]) {
        Commonelement ce = new Commonelement();

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 3, 4, 9, 0};
        int[] c = {4, 5, 6, 7, 8};

        System.out.println();
        ce.common(a, b, c);

    }
}

