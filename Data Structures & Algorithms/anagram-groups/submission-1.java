class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // craete a map and count letters
        HashMap <String, List<String>> res = new HashMap<>();

        for (String str : strs){
            int[] count = new int[26];

            for (char c : str.toCharArray()){
                count[c - 'a']++;
            }


        // Look up this key in the groups map
        // if it is new, create a new list and add  to it
        // converts the integer array into a comma-separated string 
        String key = Arrays.toString(count);
        res.putIfAbsent(key, new ArrayList<>());
        res.get(key).add(str); 

        }

        return new ArrayList<>(res.values());
        
 
    }

}