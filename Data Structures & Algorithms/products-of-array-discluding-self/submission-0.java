class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] product = new int[nums.length];
        output[0] = 1;

        for(int i = 1;i< nums.length;i++){
            output[i] = output[i-1] * nums[i-1];
        }
        product[nums.length-1] = 1;

        for(int i = nums.length-2; i>=0;i--){
            product[i] = product[i+1] * nums[i+1];
            output[i] *= product[i];
        }

        return output;


        
        

        
    }
}  
