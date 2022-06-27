class Solution {
    private int getCeil(double val){
      return (int)Math.ceil(val);  
    }
    
    private int getFloor(double val){
      return (int)Math.floor(val);  
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergedArrayLen = nums1.length + nums2.length;
        
        int[] result = new int[mergedArrayLen];

        double midIndex = (mergedArrayLen - 1) / (double)2;
        
        for(int i = 0, j = 0, k = 0; k <= Math.ceil(midIndex);){
            if(i < nums1.length && j < nums2.length)
                result[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
            else if (i < nums1.length)
                result[k++] = nums1[i++];
            else if(j < nums2.length)
                result[k++] = nums2[j++];
            else break;
        }
        
        return getFloor(midIndex) == getCeil(midIndex) ? 
            result[getFloor(midIndex)] :
            (result[getFloor(midIndex)] + result[getCeil(midIndex)]) / (double)2;
    }
}