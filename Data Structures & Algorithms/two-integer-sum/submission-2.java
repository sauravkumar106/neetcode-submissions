class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                 map.put(nums[i],list);
            }else{
                ArrayList<Integer> list = map.get(nums[i]);
                list.add(i);
                map.put(nums[i],list);
            }
        }
        for(int k=0;k<nums.length;k++){
            int req = target-nums[k];
            if(map.containsKey(req)){
                ArrayList<Integer> list = map.get(req);
                int w = -1;
                for(int q=0;q<list.size();q++){
                    if(k!=list.get(q)){
                        w=list.get(q);
                        return new int[] {k,w};
                    }
                }
            }
        }
        return new int[] {-1,-1};
    }
}
