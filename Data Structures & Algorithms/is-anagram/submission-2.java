class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.equals(t)){
            return true;
        }
        if (s.length() != t.length()){
            return false;
        }
        
        char[] sletters = s.toCharArray();
        char[] tletters = t.toCharArray();
        Arrays.sort(sletters);
        Arrays.sort(tletters);
        if (Arrays.equals(sletters,tletters)){
            return true;
        }
        
        return false;
    }
}
