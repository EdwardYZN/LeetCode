/*
  Find all possible combinations of k numbers that add up to a number n , given
that only numbers from 1 to 9 can be used and each combination should be a
unique set of numbers.      Example 1:  Input: k = 3, n = 7  Output:  [[1,2,4]]
Example 2:  Input: k = 3, n = 9  Output:  [[1,2,6], [1,3,5], [2,3,4]]   Credits:
Special thanks to @mithmatt for adding this problem and creating all test cases.
Subscribe to see which companies asked this question    Show Tags   Array
Backtracking     Show Similar Problems   (M) Combination Sum
*/


public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        ArrayList<Integer> curr=new ArrayList<Integer>();
        combinationSum(k,n,1,curr,result);
        return result;
    }
    public void combinationSum(int k,int m,int i,ArrayList<Integer> curr,List<List<Integer>> result){
      if(k==0&&m==0){
        ArrayList<Integer> temp=new ArrayList<Integer>(curr);
        result.add(temp);
        return;
      }
      else if(k==0&&m!=0){
        return;
      }
      for(int j=i;j<10;j++){
        if(j>m){
          return;
        }
        curr.add(j);
        combinationSum(k-1,m-j,j+1,curr,result);
        curr.remove(curr.size()-1);
      }
    }
}
