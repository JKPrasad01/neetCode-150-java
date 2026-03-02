package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArraysAndHashingProblems {
    public static void main(String[] args) {

    }

    //1.
    public boolean hasDuplicate1(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return true;
            }
        }
        return false;
    }

    //2.
    public boolean hasDuplicate2(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    public boolean hasDuplicate3(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) return true;

            set.add(num);
        }
        return false;
    }

}