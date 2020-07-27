import java.util.HashMap;
import java.util.Map;

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
     * 优化版本
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums!=null||nums.length>0) {
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i <nums.length ; i++) {
                int one = nums[i];
                int theOther = target - one;
                if (map.containsKey(theOther)) {
                    return new int[] {i, map.get(theOther)};
                }else {
                    map.put(one, i);
                }

            }
        }
        return  null;

    }
}