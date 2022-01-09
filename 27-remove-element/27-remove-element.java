class Solution {
    private void shiftArray(int[] nums,int start,int end){
        for(int i = start; i < end;i++){
            nums[i] = nums[i + 1];
        }
    }
    
    public int removeElement(int[] nums, int target) {
        int shiftLen = nums.length - 1;
        
        for(int i = 0; i < nums.length && shiftLen >= i; i++){
            if(nums[i] == target){
                shiftArray(nums,i,shiftLen--);
                --i;
            }
        }
        
        return shiftLen + 1;
    }
}