class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numSet = new HashMap<>();
        
        
        for (int i=0; i<nums.length; i++){
            int current = nums[i];
            int diff = target - current;
            if (numSet.containsKey(diff)){
                return new int[]{numSet.get(diff), i}; 
            }
            numSet.put(current, i);
            }
        return new int[]{};
        }
    }

