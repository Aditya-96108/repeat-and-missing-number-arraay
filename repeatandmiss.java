import java.util.*;
public class repeatandmiss{
    public static int check1(int[] nums)
    {
        for(int i=0;i<nums.length-1;i++)
        
            for(int j=i+1;j<nums.length;j++)
            
                if(nums[i]==nums[j])
                
                    return nums[i];
                
            return 0;
        
        
    }
    public static int check3(int[] nums)
    {
        HashSet<Integer> hash1=new HashSet<>();
        hash1.add(0);
        hash1.add(1);
        hash1.add(2);
        hash1.add(3);
        hash1.add(4);
        hash1.add(5);
        hash1.add(6);
        hash1.add(7);
        hash1.add(9);
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int iter : hash1)
        {
            
           if(iter>max)
           {
            max=iter;
           }
           sum=sum+iter;
        }
        int actualsum=(max*(max+1))/2;
        int result=actualsum-sum;
        return result;
    }
    public static int check(int[] nums)
    {
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            sum=sum+nums[i];
        }
        int actualsum=(max*(max+1))/2;
        int result=actualsum-sum;
        return result;
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] nums={9,6,4,2,3,5,7,0,1,9};
        int done3=check3(nums);
        System.out.println(done3);
        int done2=check1(nums);
        System.out.println(done2);
        //int done=check(nums);
        //System.out.println(done);
    }
}