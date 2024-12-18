public class Lab2 {

    //field
    double[] nums;

    //constructor
    public Lab2(double[] nums){
        this.nums = nums;
    }
    
    public double sum(){
        double sum = 0;
        for (int i = 0; i <= nums.length-1; i++){
            sum += nums[i];
        }
        return sum;
    }

    public double avg(){
        return sum()/nums.length;
    }

    public double max(){
        double ans = 0;
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] <= nums[i+1]){
                ans = nums[i+1];
            }
        }
        return ans;
    }
    public double min(){
        double ans = nums[0];
        for (int i = 0; i < nums.length-1; i++){
            if (ans >= nums[i+1]){
                ans = nums[i+1];
            }
        }
        return ans;
    }
}
