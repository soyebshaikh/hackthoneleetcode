/* 
Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 

Constraints:

1 <= intervals.length <= 104
intervals[i].length == 2
0 <= starti <= endi <= 104
*/

class Solution {
    public int[][] merge(int[][] intervals) {
      // If the values are one or the 0 then there is nothing to compare with the intervals
        if(intervals.length<=1){
            return intervals;

        }
      
      
      // sorting the frist index of the two d array so that it will be easy to compare  for example  [[1,3],[2,6],[8,10],[15,18]]
             Arrays.sort(intervals, (arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));

    // use the List <int[]> because we don't know the size of the array 

        List<int[]> output_arr=new ArrayList();
      // Then  making a array of current interval  for eg= [1,3]
        
        int[] current_interval=intervals[0];
    // adding to the list
        output_arr.add(current_interval);
     // using the for loop we itarate the values and compare
        for(int[] interval:intervals){
            int current_begin=current_interval[0];
            int current_end=current_interval[1];
            int next_begin=interval[0];
            int next_end=interval[1];
          
          // current_end = 3 and the next_begin is 2
            if(current_end>=next_begin){
              // current end =3 and the next_end is 6 
              //so it became [1,6]
                current_interval[1]=Math.max(current_end, next_end);

            }else{
              // if not same then changed the  current interval and add to the list 
                current_interval=interval;
                output_arr.add(current_interval);
            }

        }

      // converting the list to the array using the following  mathods

        return output_arr.toArray(new int[output_arr.size()][]);
    
    }
}


