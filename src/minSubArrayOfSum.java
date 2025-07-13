//Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater than or equal to ‘S’. Return 0, if no such subarray exists.
//
//Example 1:
//
//Input: [2, 1, 5, 2, 3, 2], S=7
//Output: 2
//Explanation: The smallest subarray with a sum greater than or equal to '7' is [5, 2].
public class minSubArrayOfSum {
    public static int minSubArray(int k, int[] array){
        int windowStart = 0, windowSum = 0, minLength = Integer.MAX_VALUE;
        for(int windowEnd = 0; windowEnd < array.length; windowEnd++){
            windowSum += array[windowEnd];
            while(windowSum >= k){
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= array[windowStart];
                windowStart++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
//    the time complexity of the fxn is 0(N) since the outer for loop
//    runs for all elements while the inner while loop process once for each element therefore the timeComplexity is 0(N*N),
//    but due to asymptotically it becomes 0(N).
    public static void main(String[] args){
        int result = minSubArray(7, new int[] {2, 1, 5, 2, 8});
        System.out.println(result);
    }
}
