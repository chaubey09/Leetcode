import java.util.*;
public class jump2 {
    public static void main(String[] args){
        int[] nums={2,4,1,2,3,1,1,2};
        int totaljumps = 0;

        // destination is last index
        int destination = nums.length-1;
        int coverage=0,lastjump=0;

        //base case

        if(nums.length==1){
            System.out.println("Wrong Input");
        } 

        //Greedy strategy: extend coverage as long as possible
         for(int i=0;i<nums.length;i++){
            coverage=Math.max(coverage, i+nums[i]);
            if(i== lastjump){
                lastjump = coverage;
                totaljumps++;

                //check if we reached destination already
                if(coverage>=destination){
                    System.out.println("The minimum NNumber of Jumps required are ="+totaljumps);
                }
            }
         }
         System.out.println("The minimum NNumber of Jumps required are ="+totaljumps);
}
}
