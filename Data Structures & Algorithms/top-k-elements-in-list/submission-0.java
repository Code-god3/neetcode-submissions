class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        Queue<Integer> queue = new PriorityQueue<>((a,b) -> map.get(a)-map.get(b));
        for(int i: map.keySet()){
            queue.add(i);
            if(queue.size() > k){
                queue.poll();
            }
        }

        int[] arr = new int[k];
        for(int i = 0; i < k;i++){
            arr[i] = queue.poll();
        }
        return arr;
    }
}
