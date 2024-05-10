public class erfenchazhao {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(chazhao(arr, 4));
    }
    public static int chazhao(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid_index = left + (right-left)/2;
            if(nums[mid_index]==target){
                return mid_index;
            } else if (nums[mid_index]<target) {
                left = mid_index+1;
            }else {
                right = mid_index-1;
            }
        }
        return -1;
    }
}
