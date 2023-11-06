public class rduplicate {
    public static void main(String[] args){
             int nums[] = {1,1,1,2,2,3};
             System.out.println(Rduplicate(nums));
    }
    public static int Rduplicate(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1] && nums[i]==nums[i+2]){
                continue;
            }
            else{
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}

