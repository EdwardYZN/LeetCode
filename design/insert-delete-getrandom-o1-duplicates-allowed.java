/*
 Design a data structure that supports all following operations in average  O(1)
time.  Note: Duplicate elements are allowed.    insert(val) : Inserts an item
val to the collection.  remove(val) : Removes an item val from the collection if
present.  getRandom : Returns a random element from current collection of
elements. The probability of each element being returned is linearly related to
the number of same value the collection contains.    Example:  // Init an empty
collection.
RandomizedCollection collection = new RandomizedCollection();
// Inserts 1 to the collection. Returns true as the collection did not contain
1.
collection.insert(1);
// Inserts another 1 to the collection. Returns false as the collection
contained 1. Collection now contains [1,1].
collection.insert(1);
// Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
collection.insert(2);
// getRandom should return 1 with the probability 2/3, and returns 2 with the
probability 1/3.
collection.getRandom();
// Removes 1 from the collection, returns true. Collection now contains [1,2].
collection.remove(1);
// getRandom should return 1 and 2 both equally likely.
collection.getRandom();    Subscribe to see which companies asked this question
Show Tags   Array  Hash Table  Design     Show Similar Problems   (H) Insert
Delete GetRandom O(1)
*/


public class RandomizedCollection {

    /** Initialize your data structure here. */
    public RandomizedCollection() {
        
    }
    
    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        
    }
    
    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        
    }
    
    /** Get a random element from the collection. */
    public int getRandom() {
        
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */