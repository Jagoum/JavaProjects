import java.util.*;
public class MergeArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int n = nums1.length;
        int m = nums2.length;
        int mi = m - 1;
        int ni = n - 1;
        int ri = n + m - 1;
        while(ni>=0)
        {
            if(nums1[mi] > nums2[ni])
            {
                nums1[ri] = nums1[mi];
                mi -= 1;
            }
            else {
                nums1[ri] = nums2[ni];
                ni -= 1;
            }
            ri -=1;
        }
        for(int i = 0; i<nums1.length; i++)
        {
            System.out.println(nums1[i] + " ");
        }
    }
}
