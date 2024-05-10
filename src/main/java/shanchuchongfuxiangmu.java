import java.util.HashSet;

public class shanchuchongfuxiangmu {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        int[] arr = new int[nums.length];
        HashSet set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                arr[set.size()-1] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        return set.size();
    }
}
