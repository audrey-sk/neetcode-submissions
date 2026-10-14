class Solution {

// For every string, we write length#string
// The # character acts as a boundary between the length and the content, and using the length ensures we know exactly how many characters to read, no matter what characters appear in the string 

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs){
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    // For decoding, we read characters until we reach # to find the length, then extract that many characters as the string 

    public List<String> decode(String str) {
        List<String> res = new ArrayList();
        int i =0;
        while (i < str.length()){
            int j =i;

            while (str.charAt(j) != '#'){
                j++;
            }

            int length = Integer.parseInt(
                str.substring(i, j)
            );

            int start = j+1;
            int end = start + length;

            res.add(str.substring(start,end));

            i = end;
        }
        return res;

    }
}
