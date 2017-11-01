import java.util.ArrayList;

/**
 * Created by Viral on 10/1/2017.
 */
public class insertionSort {
    public static void main(String args[]) {
        int a[] = {5, 8, 1, 3, 9, 6};
        insertion_sort(a);
    }

    public static void insertion_sort(int[] a) {
        for (int i = 1 ; i < a.length ; i++) {
            int key = a[i] ;
            int j = i - 1 ;
            while(j >= 0 && key < a[j]) {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                j--;
            }
        }
        for(int x : a) {
            System.out.print(x + " ");
        }
    }

}
