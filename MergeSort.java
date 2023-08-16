public class MergeSort {
    public static void divide(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int id1 = si;
        int id2 = mid + 1;
        int x = 0;
        int[] merged = new int[ei - si + 1];
        while (id1 <= mid && id2 <= ei) {
            if (arr[id1] <= arr[id2]) {
                merged[x++] = arr[id1++];
            } else {
                merged[x++] = arr[id2++];
            }
        }
        while (id1 <= mid) {
            merged[x++] = arr[id1++];
        }
        while (id2 <= ei) {
            merged[x++] = arr[id2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 74, 85, 62, 33, 14, 75 };
        int n = arr.length;
        divide(arr, 0, n - 1);
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
