import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        boolean swapped;
      int nums []= {1,9,6,4,5};

     
      
      for(int i = 0 ; i<nums.length-1;i++){
           swapped= false;
          for(int j = 0; j<nums.length-1-i; j++){
              if(nums[j]>nums[j+1]){
                  int temp = nums[j];
                  nums[j]=nums[j+1];
                  nums[j+1] = temp;
                  swapped = true;
                
              }
             
              }
              if(swapped==false){
                  break;
          }
      }
      
      
      
      // to print
    System.out.println(Arrays.toString(nums));
   
    }
}
