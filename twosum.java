package chandriki2;
import java.util.Scanner;
public class twosum {
        
        public int[]  twoSum(int[] nums, int target) {
       int sum=0;
        int res[]=new int[2];
       for(int i=0;i<nums.length;i++)
       {
           for(int j=i+1;j<nums.length;j++)
           {
           sum=nums[i]+nums[j];
             if(sum==target)           
               {
              res[0]=i;    
              res[1]=j;
             }
           }
           
       }       
       return res;   
   }
class A{
   public static void main(String args[])
   {  
        Scanner sc=new Scanner(System.in);
         int[] nums=new int[20];
            for(int k=0;k<20;k++)
            {
                 nums[k]=sc.nextInt();
            }
               int target=sc.nextInt();
               twosum t=new twosum();
               t.twoSum(nums,target);
   }
}

}
