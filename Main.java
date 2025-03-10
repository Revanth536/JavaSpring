import java.util.*;

public class Main {


    // Merge sort
    public static int[] split(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr;
        int mid = n / 2;
        int lf[] = split(Arrays.copyOfRange(arr, 0, mid));
        int rt[] = split(Arrays.copyOfRange(arr, mid, n));
        return ms(lf, rt);
    }

    public static int[] ms(int[] l, int[] r) {
        int w[] = new int[l.length + r.length];
        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] < r[j])
                w[k++] = l[i++];
            else
                w[k++] = r[j++];
        }
        while (i < l.length)
            w[k++] = l[i++];
        while (j < r.length) {
            w[k++] = r[j++];
        }
        return w;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println(Arrays.toString(split(a)));
    }
}
