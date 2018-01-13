package Algorithm;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by Viral on 1/13/2018.
 */
public class SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(sortCharactersByFrequency("virral"));
    }

    public static String sortCharactersByFrequency(String s) {

        //map for maintaining count of each character
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i ++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < map.size(); i ++) {
            char chr = pq.poll().getKey();
            int count = map.get(chr);

            for (int j = 0; j < count; j ++) {
                sb.append(chr);
            }
        }

        return sb.toString();
    }
}
