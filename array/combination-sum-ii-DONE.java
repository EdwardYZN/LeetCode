/*
 Given a collection of candidate numbers ( C ) and a target number ( T ), find
all unique combinations in C where the candidate numbers sums to T .  Each
number in C may only be used once in the combination.  Note:   All numbers
(including target) will be positive integers.  The solution set must not contain
duplicate combinations.    For example, given candidate set [10, 1, 2, 7, 6, 1,
5] and target 8 , A solution set is:  [
[1, 7],
[1, 2, 5],
[2, 6],
[1, 1, 6]
]    Subscribe to see which companies asked this question    Show Tags   Array
Backtracking     Show Similar Problems   (M) Combination Sum
*/


public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
        combinationSum(candidates,target-candidates[i],i+1,current,result);
        current.remove(current.size()-1);
        while(i<candidates.length-1 && candidates[i]==candidates[i+1]) i++;
      }
    }
}
