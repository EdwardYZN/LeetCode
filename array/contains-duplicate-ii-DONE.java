/*
 Given an array of integers and an integer k , find out whether there are two
distinct indices i and j in the array such that nums[i] = nums[j] and the
difference between i and j is at most k .   Subscribe to see which companies
asked this question    Show Tags   Array  Hash Table     Show Similar Problems
(E) Contains Duplicate  (M) Contains Duplicate III
*/


public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
          if(map.containsKey(nums[i])){
            if(i-map.get(nums[i])<=k)
              return true;
          }
          map.put(nums[i],i);
        }
        return false;
    }
}
