public class LinearSearchAlgorithm {
    
    public static int LinearSearch(int[] arr, int target)
    {
        int steps = 0;
for(int i=0;i<arr.length;i++)
{
    steps ++;
    if(arr[i]==target)
    return i;
}
System.out.println("Number of steps taken : "+ steps);
return -1;
    }
public static void main(String[] args) {
    int[] arr={9,3,10,4,6,23,1};
    int target = 0;
    System.out.print("Array = ");
    for(int i : arr){
System.out.print(i+" ");
    }
    System.err.println();
   int  result = LinearSearch(arr , target);
   if(result == -1)
   System.out.println(target + " not found in the array");
   else
   System.out.println(target + " found at index "+ result);
    }
   
    
}

