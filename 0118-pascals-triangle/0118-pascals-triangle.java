class Solution {
    public List<List<Integer>> generate(int numRows) {

List <List<Integer>> res= new ArrayList<List<Integer>>();
        List<Integer> row,per=null;
        for(int i=0;i<numRows;++i){
            row=new ArrayList<Integer>();
            for(int j=0;j<=i;++j){
                if(j==0|| j==i){
                    row.add(1);
                }else{
                    row.add(per.get(j-1)+per.get(j));
                }
            }
                per=row;
                res.add(row);
            
        }
        return res;
        
    
}
    
}
