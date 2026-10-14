class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // sum up the first and last element, compare with target, is it too large or too small?
        int len = numbers.length;
        int start = 0;
        int end = len -1;
        while (start < end){
            int sum= numbers[start] + numbers [end];
            if(sum > target){
                end --;
            }else if(sum < target){
                start++;
            }else{
                return new int [] {start+1, end+1};
            }
        }
        return new int[0];       
    }   
}

