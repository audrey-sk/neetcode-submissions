class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // sort the array
        Arrays.sort(nums);
        int len = nums.length;
        // fix one number, and use two pointers to find the other two 
        // edge case: if the first number is positive then all remaining numbers are positive, and a group of positive numbers can't sum to 0
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int start = i+1;
            int end = len - 1;

            while (start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if (sum > 0){
                    end--;
                }else if (sum < 0){
                    start++;
                }else{
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    
                    while (start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    while (start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }

                    start++;
                    end--;
                }
            }
        }
        return result;
    }
}
