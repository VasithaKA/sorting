import java.util.Arrays;

/**
 * InsertionSort
 */
public class InsertionSort {
    public static int[] insertionSort(int[] a, int n) {
        for (int i = 1; i < n; i++) {
            int t = a[i];
            //int p = i;
            int j = i;
            while (j>0 && t<a[j-1]) {
                a[j] = a[j-1];
                j--;
            }
            /*for (int j = i; j > 0; j--) {
                if (t<a[j-1]) {
                    a[j] = a[j-1];
                    p = j-1;
                }
            }*/
            //a[p] = t;
            a[j] = t;
            //System.out.println(Arrays.toString(a));
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 6, 5, 3, 1, 8, 7, 2, 4 };
                //  0  1  2  3  4  5  6  7
        System.out.println(Arrays.toString(a) + "\n");
        System.out.println("\n" + Arrays.toString(insertionSort(a, a.length)));
    }
}