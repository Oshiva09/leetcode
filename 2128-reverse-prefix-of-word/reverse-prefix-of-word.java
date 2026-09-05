class Solution {
    public String reversePrefix(String word, char ch) {
        char[] c=word.toCharArray();
        int i=0;
        int j=0;
        while(j<c.length && c[j]!=ch){
           j++;

            if(j == c.length) {
            return word;
        }
        }
        while(i<j){
             char temp=0;
            temp=c[i];
            c[i]=c[j];
            c[j]=temp;
            i++;
            j--;
        }
        return new String(c);

        
    }
}