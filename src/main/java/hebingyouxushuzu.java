public class hebingyouxushuzu {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,5,6};
        int[] arr2 = new int[]{1,2,3};
        int l1 = arr1.length;
        int l2 = arr2.length;
        System.out.println(merge(arr1, l1, arr2, l2));
    }
    public  static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merge_num = new int[m+n];
        int index1 = 0;
        int index2 = 0;
        int current = 0;
        while (index1 < m || index2 < n ){
            if(index1 == m){
                current = nums2[index2];
                index2++;
            } else if (index2 == n) {
                current = nums1[index1];
                index1++;
            }else if(nums1[index1] < nums2[index2]){
                current = nums1[index1];
                index1++;
            } else {
                current = nums2[index2];
                index2++;
            }
            merge_num[index1+index2-1] = current;
        }
        return merge_num;
    }
}
