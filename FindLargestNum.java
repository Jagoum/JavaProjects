import java.util.*;
public class FindLargestNum {
    void arrays(){}
    public static void main (String[] args)
    {
         int[] nums = new int[1000];//= {20, 4, 8, 50, 9, 1, 19, 30, 13,40};
        //int max = nums[0];
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nPlease enter Number of element of the array: ");
        int num = input.nextInt();
        System.out.printf("Please Enter %d Elements\n",num);
        for(int i=0;i<num;i++){
System.out.printf("Enter element %d :",i+1);
    nums[i] = input.nextInt();
        }
        int max = nums[0];
        for(int i=0;i<num;i++){
            
            if(nums[i]>max){
                max=nums[i];
            }
            
        }
        System.out.println("\n\nThe max number of the array is " + max);
        input.close();
    }
}
