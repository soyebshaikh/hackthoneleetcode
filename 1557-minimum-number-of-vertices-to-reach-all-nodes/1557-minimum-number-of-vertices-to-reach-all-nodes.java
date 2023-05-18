class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
    
        List <Integer> res=new ArrayList<Integer>();
        int []a=new int [n];
        for(List <Integer> edge :edges){
            int source = edge.get(0);
            int dest= edge.get(1);
            a[dest]++;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                res.add(i);
                
            }
            
        }
        return res;
        
        
    }
}