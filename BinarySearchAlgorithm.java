public class BinarySearchAlgorithm {
    public  static void InserstionSortAlgorithm(int[] arr) {
for(int i = 1;i<arr.length;i++)
{
    int key = arr[i];
    int j = i-1;
    while(arr[j]>key && j>=0)
    {
        arr[j+1]=arr[j];
        j --;
    }
    arr[j+1]=key;
}
System.out.print("\n\nSorted Array : ");
for(int i: arr){
    System.out.print(i + " ");
}
    }

    public static int BinarySearch(int[] arr, int target, int left, int right) {
        int steps = 0;
        while (left <= right) {
            steps++;
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        System.out.println("Number of steps taken : " + steps);
        return -1;

    }

    public static void main(String[] args) {
        int[] arr={1,8,2,3,5,12,4,11,10,6,7,9}; 
        int target = 10;
        InserstionSortAlgorithm(arr);
        System.out.println();
        int result = BinarySearch(arr,target,0,arr.length-1);
        //System.out.print("\n\nElements of array : ");
/*for(int i: arr){
    System.out.print(i+" ");
}*/
System.out.println();
        if(result != -1){
    System.out.println(target + " found at index : " + result);
}
else{
    System.out.println(target + " not found in the array.");
}

    }

}
