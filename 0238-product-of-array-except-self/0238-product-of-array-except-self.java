class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] leftProd=new int[n];
        int[] answer=new int[n];
        int[] rightProd=new int[n];

        int product=1;
        for(int i=0;i<n;i++){
            leftProd[i]=product;
            product=product*nums[i];
        }
        product=1;
        for(int i=n-1;i>=0;i--){
            rightProd[i]=product;
            product=product*nums[i];
        }

        for(int i=0;i<n;i++){
            answer[i]=leftProd[i]*rightProd[i];
        }
        return answer;
    }
}