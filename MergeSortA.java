import java.util.Arrays;

/**
 * MergeSortA
 */
public class MergeSortA {
    public static void mergeSort(int[] A) {
        int n = A.length;
        if (n >= 2){
            //return;
        int[] L = new int[n / 2];
        int[] R = new int[n - n / 2];
        for (int i = 0; i < n / 2; i++) {
            L[i] = A[i];
        }
        for (int i = n / 2; i < n; i++) {
            R[i - n / 2] = A[i];
        }
        //System.out.println(Arrays.toString(L) + "\n");
        mergeSort(L);
        mergeSort(R);
        merge(L, R, A);}
    }

    public static void merge(int[] L, int[] R, int[] a) {
        int nL = L.length, nR = R.length, i = 0, j = 0, k = 0;
        while (i < nL && j < nR) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < nL) {
            a[k] = L[i];
            i++;
            k++;
        }
        while (j < nR) {
            a[k] = R[j];
            j++;
            k++;
        }
        //System.out.println(Arrays.toString(a) + "\n");
    }

    public static void main(String[] args) {
        int[] A = { 8, 5, 2, 6, 9, 3, 1, 4, 0, 7 };
        System.out.println(Arrays.toString(A) + "\n");
        mergeSort(A);
        System.out.println(Arrays.toString(A) + "\n");
    }
}