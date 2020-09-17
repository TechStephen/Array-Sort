import java.util.*;

public class code {

    int[] temp = new int[7];
    
    public code(){
        
    }

    public int sort(int[] nums) {
        int x = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j]){
                    cnt++;
                }             
            }
            temp[cnt] = nums[i];
            cnt = 0;
        }
        System.out.println(Arrays.toString(temp));
        return x;
    }
}