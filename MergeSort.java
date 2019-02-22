import java.util.Arrays;

/**
 * MergeSort
 */
public class MergeSort {
    public static void merge(int[] a, int b, int m, int e) {
        int[] A = new int[m - b + 1];
        int[] B = new int[e - m];
        for (int i = 0; i < A.length; i++) {
            A[i] = a[b + i];
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = a[m + i + 1];
        }
        int i = 0, j = 0, k = b;

        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                a[k] = A[i];
                i++;
            } else {
                a[k] = B[j];
                j++;
            }
            k++;
        }
        while (i < A.length) {
            a[k] = A[i];
            i++;
            k++;
        }
        while (j < B.length) {
            a[k] = B[j];
            j++;
            k++;
        }
        //System.out.println(Arrays.toString(a) + "\n");
    }

    public static void mergeSort(int[] a, int b, int e) {
        if (b < e) {
            mergeSort(a, b, (e+b) / 2);
            mergeSort(a, (e+b+2) / 2 , e);
            merge(a, b, (e+b) / 2, e);
        }
    }

    public static void main(String[] args) {
        int[] a = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
        // 0 1 2 3 4 5 6 7
        System.out.println(Arrays.toString(a) + "\n");
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a) + "\n");
        // System.out.println(2/2+1);
        // merge(a, 0, a.length/2, a.length-1);
        // System.out.println("\n" + Arrays.toString(mergeSort(a, 0, a.length-1)));
    }
}