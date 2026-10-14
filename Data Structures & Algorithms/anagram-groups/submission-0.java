class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // craete a map and count letters
        HashMap <String, List<String>> groups = new HashMap<>();

        for (String str : strs){
            int[] count = new int[26];

            for (char c : str.toCharArray()){
                count[c - 'a']++;
            }

        // turn that count into a text signature by separating      counts with #
        StringBuilder key = new StringBuilder();
        for (int freq : count){
            key.append('#').append(freq);
        }

        // Look up this key in the groups map
        // if it is new, create a new list and add  to it.
        groups.computeIfAbsent( 
            key.toString(),
                k -> new ArrayList<>()
            ).add(str);
        }

        return new ArrayList<>(groups.values());
    }
}