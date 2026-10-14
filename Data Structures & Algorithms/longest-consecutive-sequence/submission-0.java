class Solution {
    public int longestConsecutive(int[] nums) {
        //put everything in nums into a hashset

        HashSet <Integer> numset = new HashSet<>();

        for (int num : nums){
            numset.add(num);
        }
        // //to track the length of the longest consecutive sequence
        int longest =0; 

        for (int num : numset){
            if(!(numset.contains(num-1))){
                int len =1;

                while (numset.contains(num+len)){
                    len++;
                }
            longest = Math.max(longest, len);
            }
        }
        return longest;
        
    }
}
