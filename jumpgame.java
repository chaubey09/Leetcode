public class jumpgame {
    public static void main(String[] args){
        int[] nums = new int[]{2,3,1,1,4};
        int finalpos = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]+i>=finalpos){
                finalpos=i;
            }
        }
        System.out.println("The last position that can be reached is "+ (finalpos+1));
    }
}
