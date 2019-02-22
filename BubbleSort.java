import java.util.Arrays;

class BubbleSort {
	public static int[] bubbleSort(int[] a, int n) {
		for (int j = n - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (a[i] > a[i + 1]) {
					int t = a[i];
					a[i] = a[i + 1];
					a[i + 1] = t;
					//System.out.println(Arrays.toString(a));
				}
			}
		}
		return a;
	}

	public static void main(String[] args) {
		int[] a = { 8, 7, 6, 5, 4, 3, 2, 1 };
				//  0  1  2  3  4  5  6  7  6, 5, 3, 1, 8, 7, 2, 4
		System.out.println(Arrays.toString(a) + "\n");
		System.out.println("\n" + Arrays.toString(bubbleSort(a, a.length)));
	}
}