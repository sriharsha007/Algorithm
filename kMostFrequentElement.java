package Algorithm;

import java.util.*;

/**
 * Leetcode 347. Top K Frequent Elements
 */
public class kMostFrequentElement {
    public static void main(String[] args) {
        int a[] = {1,1,1,2,2,3};
        List<Integer> res = kMostFrequent(a, 2);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    public static List<Integer> kMostFrequent(int[] a, int k) {

        //constructing priority queue to store map entries based on values of the hashmap
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(o1.getValue() > o2.getValue()) {
                    return -1;
                } else if (o1.getValue() < o2.getValue()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        //constructing hashmap to store count of each element
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int t : a) {
            if(map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
        }

        //Add code to add elements in the priority queue
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i ++) {
            res.add(pq.poll().getKey());
        }

        return res;

    }
}
