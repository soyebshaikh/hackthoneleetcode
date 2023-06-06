class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int c=0;
        for(int i=0;i<arr.length-1;i++){
            int sum=Math.abs(arr[i]-arr[i+1]);
            if(i==0){
               c=sum; 
                
            }else if(c!=sum){
                return false;
            }else{
            
            }
            
        }
        return true;
        
    }
}