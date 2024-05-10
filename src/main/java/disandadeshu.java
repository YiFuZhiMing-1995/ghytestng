import java.util.HashSet;

public class disandadeshu {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,5,3,5};
        System.out.println(thirdMax(array));
    }
    public static int thirdMax(int[] nums) {
        HashSet set = new HashSet();
        int l_n = nums.length;
        int max = 0;
        for (int i = 0; i < l_n; i++) {
            int target = nums[i];
            if(max < target){
                max = target;
            }
            for (int j = 0; j < l_n; j++) {
                if(nums[j] > target){
                    set.add(nums[j]);
                }
            }
            if(set.size()==2){
                return target;
            }
            set.clear();
        }
        return max;
    }
}
