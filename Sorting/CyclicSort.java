import java.util.*;

 class CyclicSort {
    public static void main(String args[]) {
    // cyclic sort
    // for cyclic sort remember the array should be from (1 to n )
    
    int [] nums = {5,3,4,1,2};
    int size = nums.length-1;
    int i =0;
    while(i<=size){
        int correctIndex= nums[i]-1;
        if(nums[i]!=nums[correctIndex]){
            int temp = nums[i];
            nums[i] = nums[correctIndex];
            nums[correctIndex] = temp;
        }else{
            i++;
        }
    }
    
    System.out.println(Arrays.toString(nums));
    
    
    
    }
}
