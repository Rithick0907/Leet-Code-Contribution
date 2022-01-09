class Solution {
    public int[] twoSum(int[] nums, int target) {
        var hm = new HashMap<Integer,Integer>();
        int index1 = 0;
        int index2 = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(hm.containsKey(target - nums[i])){
                index1 = hm.get(target - nums[i]);
                index2 = i;
                break;
            }
            
            hm.put(nums[i],i);
        }
        
        return new int[]{index1,index2};
    }
}