class Solution {
    public int search(int[]nums ,int target){
        int start = 0;
        int end = nums.length - 1;
        //return index
        //return -1 if does not exist
        while(start<=end){
            //find mid
            int mid = start + (end-start)/2;
            if (target < nums[mid]){
                end = mid - 1;
            }else if (target > nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}