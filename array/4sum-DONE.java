/*
 Given an array S of n integers, are there elements a , b , c , and d in S such
that a + b + c + d = target? Find all unique quadruplets in the array which
gives the sum of target.  Note: The solution set must not contain duplicate
quadruplets.  For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
A solution set is:
[
[-1,  0, 0, 1],
[-2, -1, 1, 2],
[-2,  0, 0, 2]
]   Subscribe to see which companies asked this question    Show Tags   Array
Hash Table  Two Pointers     Show Similar Problems   (E) Two Sum  (M) 3Sum
*/


public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length-3;i++){
          if(i!=0 && nums[i]==nums[i-1])
            continue;
          for(int j=i+1;j<nums.length-2;j++){
            if(j!=i+1 && nums[j]==nums[j-1])
              continue;
            int k=j+1;
            int l=nums.length-1;
            while (k<l){
              int sum=nums[i]+nums[j]+nums[k]+nums[l];
              if(sum==target){
                ArrayList<Integer> elem=new ArrayList();
                elem.add(nums[i]);
                elem.add(nums[j]);
                elem.add(nums[k]);
                elem.add(nums[l]);
                result.add(elem);
                k++;
                l--;
                while(k<l && nums[l]==nums[l+1]){
                  l--;
                }
                while(k<l && nums[k]==nums[k-1]){
                  k++;
                }
              }
              else if(sum>target){
                l--;
              }
              else{
                k++;
              }
            }
          }
        }

        return result;
    }
}
