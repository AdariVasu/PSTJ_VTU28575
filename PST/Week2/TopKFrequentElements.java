import java.util.*;
class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> f=new HashMap<>(); for(int x:nums)f.merge(x,1,Integer::sum);
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->Integer.compare(f.get(a),f.get(b)));
        for(int x:f.keySet()){pq.offer(x);if(pq.size()>k)pq.poll();}
        int[] ans=new int[k];for(int i=k-1;i>=0;i--)ans[i]=pq.poll();return ans;
    }
}
