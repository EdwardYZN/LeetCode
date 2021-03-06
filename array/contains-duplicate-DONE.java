/*
 Given an array of integers, find if the array contains any duplicates. Your
function should return true if any value appears at least twice in the array,
and it should return false if every element is distinct.   Subscribe to see
which companies asked this question    Show Tags   Array  Hash Table     Show
Similar Problems   (E) Contains Duplicate II  (M) Contains Duplicate III
*/


public class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();

        for(int i=0;i<nums.length;i++){
          if(set.contains(nums[i]))
            return true;
          else
            set.add(nums[i]);
        }
        return false;
    }
}
