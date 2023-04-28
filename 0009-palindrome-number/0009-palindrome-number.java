class Solution {
    public boolean isPalindrome(int x) {
      /*  int y=0;
        int m=x;
        int i=x;
        
        while( x>0 ){
            int l=x%10;
            x=x/10;
            y=(y*10)+l;
        }*/
         int temp=x;
        if(x<0){
            x=-x;
        }
       
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+x%10;
            x=x/10;
        }
        if(temp<0)
        {
            if(temp==rev){
            return true;
        }else{
            return false;
        }
        }
        else{
        if(temp==rev){
            return true;
        }else{
            return false;
        }
        }
    }
}