class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int left=0;
        int right=heights.length-1;
        while(left<right){
            int min=Math.min(heights[left],heights[right]);
            max=Math.max(max,min*(right-left));
            if(min==heights[left]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
