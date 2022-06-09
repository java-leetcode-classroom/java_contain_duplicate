# java_contain_duplicate

Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

## Examples

**Example 1:**

```
Input: nums = [1,2,3,1]
Output: true

```

**Example 2:**

```
Input: nums = [1,2,3,4]
Output: false

```

**Example 3:**

```
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

```

**Constraints:**

- `1 <= nums.length <= $10^5$`
- $`-10^9$ <= nums[i] <= $10^9$`

## 解析
給定一個整數陣列 nums
要求寫一個演算法去判斷是否有重複值

可以透過 hashSet 來紀錄每次出現過的值
每次只要發現 hashSet 有出現過的值
就直接回傳 true

時間複雜度為 O(n)
空間複雜度為 O(n)
## 程式碼
```java
import java.util.HashSet;

public class Solution {
    public boolean containDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();
        for (int num : nums) {
            if (hash.contains(num)) {
                return true;
            }
            hash.add(num);
        }
        return false;
    }
}
```
## 困難點

1. 理解 HashTable 作用

## Solve Point

- [x]  Understand what problem to solve
- [x]  Analysis Complexity