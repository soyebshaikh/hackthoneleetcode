/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode temp=head;      
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
            
            
            
        }
        List<Integer> a=new ArrayList<Integer>();
         List<Integer> b=new ArrayList<Integer>();
        temp=head;
        for(int i=0;i<=(size/2)-1;i++){
            a.add(temp.val);
            temp=temp.next;
                    
        }
             for(int i=(size/2);temp!=null;i++){
            b.add(temp.val);
            temp=temp.next;
                    
        }
            int sum=0,i=0,j=b.size()-1,max=0;
        while(i<a.size()-1|| j>=0){
            sum=a.get(i)+b.get(j);
            
            i++;
            j--;
            if(max<sum){
                max=sum;
                
            }
        }
        
            return max;
            
    }
}