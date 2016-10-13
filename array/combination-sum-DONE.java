/*
 Given a set of candidate numbers ( C ) and a target number ( T ), find all
unique combinations in C where the candidate numbers sums to T .  The same
repeated number may be chosen from C unlimited number of times.  Note:   All
numbers (including target) will be positive integers.  The solution set must not
contain duplicate combinations.    For example, given candidate set [2, 3, 6, 7]
and target 7 , A solution set is:  [
[7],
[2, 2, 3]
]    Subscribe to see which companies asked this question    Show Tags   Array
Backtracking     Show Similar Problems   (M) Letter Combinations of a Phone
Number  (M) Combination Sum II  (M) Combinations  (M) Combination Sum III  (M)
Factor Combinations  (M) Combination Sum IV
*/


public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      List<List<Integer>> result=new ArrayList<List<Integer>>();
      Arrays.sort(candidates);

      if(candidates==null || candidates.length<1)
        return result;
      ArrayList<Integer> current=new ArrayList<Integer>();
      combinationSum(candidates, target, 0, current, result);
      return result;
    }

    public void combinationSum(int[] candidates,int target,int j,ArrayList<Integer> current,List<List<Integer>> result){
      if(target==0){
        ArrayList<Integer> temp=new ArrayList<Integer>(current);
        result.add(temp);
        return;
      }
      for(int i=j;i<candidates.length;i++){
        if(target<candidates[i])
          return;
        current.add(candidates[i]);
        combinationSum(candidates,target-candidates[i],i,current,result);
        current.remove(current.size()-1);
      }
    }
}
