//Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
// INPUT Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5

import java.util.Arrays;
public class SlidingWindow {
//    using brute force
//    Time complexity: 0(N*K)
 public static double[] AverageOfSubArraysOfSize(int k, int[] array){
     double[] newResult = new double[array.length - k + 1];

     for(int i = 0; i < array.length - k; i++){
         double sum = 0;
//         field sum for the next k elements
        for(int j = i; j < i + k; j++){
            sum += array[j];

            newResult[i] = sum / k;
        }
     }
     return newResult;
 }

// using sliding window approach
//    time complexity 0(N)
    public static double[] AverageSubArraysOfSize2(int k, int[] array){
     double[] result = new double[array.length - k + 1];
     int windowStart = 0;
     double windowSum = 0;
     for(int windowEnd = 0; windowEnd < array.length; windowEnd++){
         windowSum += array[windowEnd];
         if(windowEnd > k - 1){
             result[windowStart] = windowSum / k;
             windowSum -= array[windowStart];
             windowStart++;
         }
     }
     return result;
    }

 public static void main(String[] args){
     int[] array = {1, 3, 2, 6, -1, 4, 1, 8, 2};
     int k = 5;
     double[] result = AverageSubArraysOfSize2(k, array);
     System.out.println("Average of sub arrays of size K: " + Arrays.toString(result));
 }
}
