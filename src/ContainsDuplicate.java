import java.util.HashMap;

public class ContainsDuplicate {

}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
        for (int i : nums) {
            if (hashMap.containsKey(i)) {
                return true;
            }
            hashMap.put(i, false);
        }

        return false;
    }
}