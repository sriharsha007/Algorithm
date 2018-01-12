import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * kth Largest kthLargestElement
 *Leetcode: 215. Kth Largest Element in an Array
 */
public class kthLargestElement {
    public static void main(String[] args) {

        int nums[] = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(kthLargest(nums, k));

    }

    public static int kthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2) {
                    return -1;
                } else if(o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (int t : nums) {
            pq.add(t);
        }

        for (int i = 1; i < k; i ++) {
            pq.poll();
        }
        return pq.peek();
    }
}
