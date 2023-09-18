class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mydicx = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (!mydicx.containsKey(temp)) {
                mydicx.put(nums[i], i);
            } else {
                return new int[]{i, mydicx.get(temp)};
            }
        }
        // Return an empty array if no solution is found
        return new int[]{};
    }
}
