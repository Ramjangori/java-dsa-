package subarrays;

import java.util.HashMap;
import java.util.Map;

public class LargetsInteger {
	    public int largestInteger(int[] nums, int k) {
	        Map<Integer, Integer> map = new HashMap<>();

	        int first = nums[0];
	        int last = nums[nums.length - 1];
	        int fcnt = 0, lcnt = 0;

	        for(int i = 0; i < nums.length; i++){
	            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

	            if(nums[i] == first) fcnt++;
	            if(nums[i] == last) lcnt++;
	        }

	        if(k == 1 || nums.length == k){
	            int maxUnique = -1;
	            for(int i = 0; i < nums.length; i++){
	                if(map.get(nums[i]) == 1){
	                    maxUnique = Math.max(maxUnique, nums[i]);
	                }
	            }
	            return maxUnique;
	        }
	        

	        if(fcnt==lcnt)  return Math.max(first,last);
	        else if(lcnt == 1) return last;
	        else if(fcnt == 1) return first;

	        return -1;
	    }
	}

