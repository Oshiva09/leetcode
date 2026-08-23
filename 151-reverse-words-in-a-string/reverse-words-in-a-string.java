class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String[] arr=new String[str.length];
        int c=0;
        for(int i=str.length-1;i>=0;i--){
            arr[c++]=str[i];
        }
        return String.join(" ",arr);
    }
}