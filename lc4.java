class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] r = new int[nums1.length+nums2.length];
        double median = 0;
        for(int i =0;i<nums1.length;i++){
            r[i] = nums1[i];
        }
        for(int i =nums1.length;i<nums1.length + nums2.length;i++){
            r[i] = nums2[i-nums1.length];
        }
Arrays.sort(r);
        if(r.length%2 == 0){
            median = (r[r.length/2]+r[(r.length/2) - 1])/2.0;
        }else{
           median=  r[r.length/2];
        }

        return median;
    }
}
