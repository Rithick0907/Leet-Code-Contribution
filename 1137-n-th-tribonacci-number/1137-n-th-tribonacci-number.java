class Solution {
    private int trib(int n, int[] values){
        if(n <= 0)  return 0;
        if(n <= 2)  return 1;
        if(values[n] != 0)  return values[n];
        
        values[n] = trib(n - 3, values) + trib(n - 2, values) + trib(n - 1, values);
        return values[n];
    }
    public int tribonacci(int n) {
        if(n <= 0)  return 0;
        if(n <= 2)  return 1;
        
        int[] values = new int[n + 1];
        trib(n,values);
        
        return values[n];
    }
}
