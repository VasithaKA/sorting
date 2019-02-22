import java.util.Arrays;

/**
 * QuickSort
 */
public class QuickSort {
    public static int partition(int[] A, int s, int e) {
        int p = A[e];
        for (int i = s; i < e; i++) {
            if (A[i] <= p) {
                int t = A[i];
                A[i] = A[s];
                A[s] = t;
                s++;
            }
        }
        A[e] = A[s];
        A[s] = p;
        System.out.println(s);
        System.out.println(Arrays.toString(A) + "\n");
        return s;
    }

    public static void quickSort(int[] A, int s, int e) {
        if (s < e) {
            int p = partition(A, s, e);
            quickSort(A, s, p - 1);
            quickSort(A, p+1, e);
        }
    }

    public static void main(String[] args) {
        int[] A = { 8, 5, 2, 6, 1, 3, 9, 7, 0, 4 };
        System.out.println(Arrays.toString(A) + "\n");
        quickSort(A, 0, A.length - 1);
        // partition(A, 0, A.length-1);
        System.out.println(Arrays.toString(A) + "\n");
    }
}