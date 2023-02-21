
// Question

// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.


// Here we are using two pointers approach to solve this problem . 


class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int startBar = 0;
        int endBar = height.length-1;
while(startBar<endBar){
    int  leftBar= height[startBar];
    int rightBar = height[endBar];
    int min_len = Math.min(leftBar, rightBar);
    int area = min_len*(endBar-startBar);
     max = Math.max(max,area );
    if(leftBar<rightBar){
        startBar++;
    } else{
        endBar--;
    }
}

   return max;   

    } 
}