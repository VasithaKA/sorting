import java.util.Arrays;

/**
 * QuickSortA
 */
public class QuickSortA {
    public static void quickSort(int[] A, int s, int e) {
        if (s<e) {
            int p = partition(A,s,e);
            quickSort(A, s, p-1);
            quickSort(A, p+1, e);
        }
    }

    public static int partition(int[] A,int s,int e) {
        int p = A[e-s];
        while (s<=e) {
            while (A[s]<p) s++;
            while (A[e]>p) e--;

            int t = A[s];
            A[s] = A[e];
            A[e] = t;
            s++;
            e--;
            //System.out.println(Arrays.toString(A) + "\n");
        }
        //System.out.println(Arrays.toString(A) + "\n");
        //System.out.println(s);
        //System.out.println(p);
        return s;
    }
    public static void main(String[] args) {
        int[] A = { 8, 5, 2, 6, 7, 3, 9, 1, 0, 4 };
        System.out.println(Arrays.toString(A) + "\n");
        quickSort(A, 0, A.length-1);
        System.out.println(Arrays.toString(A) + "\n");
    }
}