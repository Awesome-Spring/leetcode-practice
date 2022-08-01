package twosum;

import java.util.*;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 * @author jiang tao
 */
public class Solution {


    /**
     * 常规暴力解法  遍历每个元素 x,并查找是否存在一个值与 target−x 相等的目标元素
     * @param nums
     * @param target
     * @return
     */
//    public int[] twoSum(int[] nums, int target) {
//
//        if (nums!=null||nums.length>0) {
//            for (int i = 0; i <nums.length ; i++) {
//                int one = nums[i];
//                for (int j = i+1; j <nums.length ; j++) {
//                    if (target-one==nums[j]){
//                        return new int[] {i, j};
//                    }
//                }
//            }
//        }
//        return  null;
//
//    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("参数不合法");
        }
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int one = nums[i];
            int anOther = target - one;
            if (map.containsKey(anOther)) {
                return new int[]{map.get(anOther), i};
            } else {
                map.put(one,i );
            }

        }
        //it depends on
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        //[0, 1]
        System.out.println(Arrays.toString(ints));

    }
}