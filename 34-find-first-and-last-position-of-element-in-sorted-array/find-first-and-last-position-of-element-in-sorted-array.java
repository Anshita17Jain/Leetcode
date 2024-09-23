class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};  // Default result if target not found
        // Find the first occurrence of the target
        result[0] = findPosition(nums, target, true);
        // If the first position is -1, no need to search for the last occurrence
        if (result[0] != -1) {
            result[1] = findPosition(nums, target, false);
        }return result;
    }
    static int findPosition(int[] nums, int target, boolean findFirst) {
            int start = 0;
            int end = nums.length - 1;
            int index = -1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[mid] == target) {
                    index = mid;  // Potential index found
                    if (findFirst) {
                        end = mid - 1;  // Narrow to the start for the first occurrence
                    } else {
                        start = mid + 1;  // Narrow to the end for the last occurrence
                    }
                } else if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            return index;
        }
}
    