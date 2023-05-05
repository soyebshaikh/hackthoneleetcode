class Solution {
    public int maxVowels(String s, int k) {
        int l=0,r=0,window=0,res=0;
        for(;r<k;r++){
            window+=isVowels(s.charAt(r));
            
        }
        res=window;
        while(r<s.length()){
            window-=isVowels(s.charAt(l++));
             window+=isVowels(s.charAt(r++));
            res=Math.max(window,res);
        }
        
        return res;
        
     
    }
     private int isVowels(char c){
           return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')?1:0;
           
       }
}