import java.util.Arrays;

/**
 * SelectionSort
 */
public class SelectionSort {
    public static int[] selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int m = a[i];
            int p = i;
            for (int j = i + 1; j < n; j++) {
                if (m > a[j]) {
                    m = a[j];
                    p = j;
                }
            }
            if (m != a[i]) {
                int t = a[i];
                a[i] = m;
                a[p] = t;
            }
            //System.out.println(Arrays.toString(a));
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
                //  0  1  2  3  4  5  6  7  6, 5, 3, 1, 8, 7, 2, 4
        System.out.println(Arrays.toString(a) + "\n");
        System.out.println("\n" + Arrays.toString(selectionSort(a, a.length)));
    }
}