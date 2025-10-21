package dsa;
import java.util.*;
/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 */
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (map.get(a)-map.get(b)));
        for (int i : nums) {
            int count = map.getOrDefault(i, 0);
            map.put(i, ++count);
        }
        for(int i : map.keySet()) {
            pq.add(i);
            if (pq.size() > k)
                pq.poll();
        }
        int[] res = new int[k];
        for (int i=0; i<k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}
