/* 169. Majority Element
Easy
12.7K
409
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.*/


class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> h = new HashMap<>();
     
        int ans=0;
        if(nums.length == 1)
            return 1;
        for(int i=0;i<nums.length;i++)
        {
            if(h.containsKey(nums[i]))
            {
                h.put(nums[i],h.get(nums[i])+1);
                if(h.get(nums[i])>nums.length/2)
                    ans=nums[i];
                    
            }
            else
            {
                h.put(nums[i],1);
            }
        }
        System.out.println(h.values());
        return ans;
        
         
        
    }
}
