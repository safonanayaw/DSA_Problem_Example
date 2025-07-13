//Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray
// of size ‘k’.
//
//Example 1:
//
//Input: [2, 1, 5, 1, 3, 2], k=3
//Output: 9
//Explanation: Subarray with maximum sum is [5, 1, 3].
public class MaxSumSubArray {
public static int MaxSumSubAArray(int k, int[] array){
    int maxSum = 0;
    for(int i = 0; i < array.length - k; i++){
        int windowSum = 0;
        for(int j = i; j < i + k; j++){
            windowSum += array[j];
            if(windowSum > maxSum)
                maxSum = windowSum;
        }
    }
    return maxSum;
}
//Efficient function for finding the Maximum averagesum of size k
public static int MaxSumSubAArray2(int k, int[] array){
    int windowStart = 0;
    int maxSum = 0;
    int windowSum = 0;
    for(int windowEnd = 0; windowEnd < array.length; windowEnd++){
        windowSum += array[windowEnd];
        if(windowEnd >= k - 1){
            if(windowSum > maxSum) {
                maxSum = windowSum;
            }
            windowSum -= array[windowStart];
            windowStart++;
        }
    }
    return maxSum;
}

    public static void main(String[] args){
        int result = MaxSumSubAArray2(3, new int[]{9, 2, 1, 5, 1, 3, 2});
        System.out.println(result);
    }
}
