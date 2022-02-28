class Solution {
    private int fib(int n,int[] values){
        if(n < 0)   return 0;
        if(values[n] != 0)  return values[n];
        
        return values[n] = fib(n-1, values) + fib(n-2, values);
    }
    
    public int fib(int n) {
        if(n <= 0)  return 0;
        int[] values = new int[n+1];
        values[1] = 1;
        fib(n, values);
        return values[n];
    }
}