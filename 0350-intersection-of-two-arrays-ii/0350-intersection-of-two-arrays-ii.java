import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       ArrayList<Integer> ans = new ArrayList<>();
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int i = 0, j = 0;
            while(i < nums1.length && j < nums2.length){
                if(nums1[i] == nums2[j]){
                    ans.add(nums1[i]);
                    i++;
                    j++;
                }
                    
                else if(nums1[i] < nums2[j])
                    i++;
                else
                    j++;
            }
            
            int[] c = new int[ans.size()];
            for(int p= 0; p<ans.size(); p++){
                c[p] = ans.get(p);
            }
            return c;
    }
}
