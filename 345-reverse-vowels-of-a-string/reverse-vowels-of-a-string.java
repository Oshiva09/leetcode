class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int l=0;
        int r=arr.length-1;
        while(l<r){
            while(l<r && !isVowel(arr[l])){
                l++;
            }
            while(l<r && !isVowel(arr[r])){
            r--;
            }
            char t=0;
            t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        return new String(arr);
    }
    public boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
}