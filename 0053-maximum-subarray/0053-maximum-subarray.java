class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
      
            
        
        if(nums.length ==1){
            return nums[0];
        }
        else{
        for(int i =0; i<=nums.length-1 ;i++){
           sum=Math.max(nums[i],sum+nums[i]); 
            
            maxSum=Math.max(maxSum,sum);
            }
            
            
            
        }
       
        return maxSum;
        }
        
    }
