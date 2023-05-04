class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        int wstart = 0;
        int wend = 0;
        long sum = 0;
        long ans = Integer.MIN_VALUE;
        while(wend < N)
        {
            sum += Arr.get(wend);
            if(wend - wstart + 1 == K)
            {
                //ans = Math.max(ans , sum);
                if(sum > ans)
                {
                    ans = sum;
                }
                sum = sum - Arr.get(wstart);
                wstart++;
            }
            wend++;
        }
        return ans;
    }
}
