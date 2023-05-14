import java.util.Arrays;

public class Program
{
    public static void main(String[] args) {
        int x = findMissingNumber(new int[]{1,4,8,2,3,6,7});
        System.out.print("Missing number = " + x);
        
        String input = "  Hello   World   Java  ";
        String reversed = reverseWords(input);
        System.out.println("\""+ reversed + "\"");
	}

    public static int findMissingNumber(int[] nums){
        Arrays.sort(nums);
        for(int i = 1; i < nums.length - 1; i++){
            if((nums[i+1] - nums[i]) != 1){
                return (nums[i] + 1);
            }
        }
        return 0;
    }

    public static String reverseWords(String s){
        String[] splitString = s.trim().split(" ");
        String reversed = "";
        for(int i = splitString.length - 1; i >= 0; i--){
            reversed = reversed + " " + splitString[i];
        }
        return reversed.trim();
    }


}