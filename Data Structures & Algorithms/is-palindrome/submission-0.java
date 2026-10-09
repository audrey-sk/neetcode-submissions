class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        int length = arr.length;
        int left = 0;
        int right = length-1;
        while (left < right){ 
            if (!Character.isLetterOrDigit(arr[left])) {
                left++;
                continue;
            }
            
            if (!Character.isLetterOrDigit(arr[right])) {
                right--;
                continue;
            }
            
            char head = arr[left];
            char tail = arr[right];
            if (head!=tail){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
