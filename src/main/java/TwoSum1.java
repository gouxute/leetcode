/**
 * Created by Administrator on 2015-05-22.
 */
public class TwoSum1 {
    public int[] twoSum( int []nums, int target){
        int []index = new int[nums.length];
        for(int i=0;i<=nums.length-1;i++)
            index[i]=i;
        //quicksort(nums,0,nums.length-1,index);
        int max = nums.length-1;
        int [] result = new int[2];
        boolean finish = false;
        for(int i=0;i<=max-1;i++) {
            if (!finish)
                for (int j = max; j > i; j--) {
                    if (nums[i] + nums[j] == target && i!=j) {
                        result[0] = index[i];
                        result[1] = index[j];
                        finish = true;
                        break;
                    }
                }
        }
        result[0]++;
        result[1]++;
        return result;
    }
}
