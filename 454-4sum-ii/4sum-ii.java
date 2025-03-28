class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int answer = 0;
        Map<String, Integer> cache = new HashMap<>();
        for(int l = 0; l < nums4.length; l++){
            for(int k = 0; k < nums3.length; k++){
                if(!cache.containsKey(String.valueOf(nums4[l]+nums3[k]))){
                cache.put(String.valueOf(nums4[l]+nums3[k]), 1);
                }else{
                cache.put(String.valueOf(nums4[l]+nums3[k]), cache.get(String.valueOf(nums4[l]+nums3[k])) + 1);
                }
            }
        }
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(cache.containsKey(String.valueOf(-(nums1[i] + nums2[j])))){
                    answer = answer + cache.get(String.valueOf(-(nums1[i] + nums2[j]))); 
                }
            }
        }
        return answer;
    }
}